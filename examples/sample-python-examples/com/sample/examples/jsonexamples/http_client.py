import base64
import json
import urllib2

class HttpClientUtil:

    def __init__(self,uri, username, password):
        self.uri = uri
        self.username = username
        self.password = password

    def get(self):
        """
        GET method.
        :return: returns response of GET API.
        """
        try:
            opener = urllib2.build_opener(urllib2.HTTPHandler)
            req = urllib2.Request(self.uri)
            if self.username and self.password:
                auth = base64.encodestring('%s:%s' % (self.username, self.password)).replace('\n', '')
            else:
                auth = ""
            if auth:
                req.add_header('Authorization', 'Basic '+auth)
            json_response_string = urllib2.urlopen(req, timeout=120).read()
            print(json_response_string)
            vlas_list = json.loads(json_response_string)

            #returns a vla json object
            return vlas_list
        except urllib2.HTTPError as e:
            if e.code == 401:
                raise RuntimeError("Authentication failed. Did you supply the correct username and password?")
            else:
                raise RuntimeError("Failed {0} with status {1}!".format(self.uri, e))
        except urllib2.URLError as e:
            raise RuntimeError("Failed {0}!".format(e.reason))

    def put(self, payload):
        """
        PUT method.
        :param payload: payload required to update.
        :return: returns response of PUT operation.
        """
        try:
            req = urllib2.Request(self.uri, payload, {'Content-Type': 'application/json'})
            req.get_method = lambda: 'PUT'
            if self.username and self.password:
                auth = base64.encodestring('%s:%s' % (self.username, self.password)).replace('\n', '')
            else:
                auth = ""
            if auth:
                req.add_header('Authorization', 'Basic '+auth)
            f = urllib2.urlopen(req)
            response = f.read()
            f.close()
            return response
        except urllib2.HTTPError as e:
            f.close()
            if e.code == 401:
                raise RuntimeError("Authentication failed. Did you supply the correct username and password?")
            else:
                f.close()
                raise RuntimeError("Failed {0} with status {1}!".format(self.uri, e))
        except urllib2.URLError as e:
            f.close()
            raise RuntimeError("Failed {0}!".format(e.reason))

    def run_func(self):
        print(self.username)

if __name__ == "__main__":
    http_util = HttpClientUtil("/","admin","admin")
    http_util.run_func()