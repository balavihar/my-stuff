import csv
import json

vlas = list()
#with open('sample.csv', newline='') as f:
with open('sample.csv', 'rb') as f:
    reader = csv.DictReader(f, delimiter=',', quotechar='|')
    for row in reader:
        #print(row)
        #print(row['VLANUMBER'])
        vlas.append(row['VLANUMBER'])

    print(vlas[0])

m = {'id': 2, 'name': 'vihar'}
n = json.dumps(m)
o = json.loads(n)
print(o['id'], o['name'])

