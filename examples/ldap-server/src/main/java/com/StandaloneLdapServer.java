package com;

import com.google.common.io.Resources;
import com.unboundid.ldap.listener.InMemoryDirectoryServer;
import com.unboundid.ldap.listener.InMemoryDirectoryServerConfig;
import com.unboundid.ldap.listener.InMemoryListenerConfig;
import com.unboundid.ldap.sdk.DN;
import com.unboundid.ldap.sdk.LDAPException;

import java.net.BindException;
import java.net.URL;

/**
 * Created by guptab4 on 3/2/2017.
 */
public class StandaloneLdapServer {

    private static String serverKeyStorePath = "";
    private static char[] serverKeyStorePIN = {};
    private static String serverTrustStorePath = "";
    private static String clientTrustStorePath = "";
    //private static String ldifFilePath = "C:\\Users\\guptab4\\469510\\examples\\ldap1\\MockLDAP\\MockLDAP-AS7\\src\\main\\resources\\openldap.ldif";
    //private static String ldifFilePath = "C:\\Users\\guptab4\\469510\\examples\\ldap1\\MockLDAP\\MockLDAP-AS7\\src\\main\\resources\\prov-ldif.ldif";
    private static URL resource = Resources.getResource(String.format("openldap.ldif"));
    private static int port = 341;

    /*public static void main1(String[] args) throws Exception {
        MockLDAP mockLDAP = new MockLDAP();
        mockLDAP.setPort(port);
        mockLDAP.setBaseDn("dn: dc=maxcrc,dc=com");
        mockLDAP.setUserDn("ausulas");
        mockLDAP.setPassword("YWRtaW4=");
        mockLDAP.setLdifFile("myldif.ldif");

        mockLDAP.start();
    }*/

    public static void main2(String[] args) throws Exception {
        // Create a base configuration for the server.
        InMemoryDirectoryServerConfig config =
                new InMemoryDirectoryServerConfig("dc=maxcrc,dc=com");
        config.addAdditionalBindCredentials("cn=Directory Manager",
                "password");
        config.setSchema(null);
        /*InMemoryListenerConfig listenerConfig = new InMemoryListenerConfig();
        config.setListenerConfigs(listenerConfig);*/

        // Update the configuration to support LDAP (with StartTLS) and LDAPS
        // listeners.
        /*final SSLUtil serverSSLUtil = new SSLUtil(
                new KeyStoreKeyManager(serverKeyStorePath, serverKeyStorePIN, "JKS",
                        "server-cert"),
                new TrustStoreTrustManager(serverTrustStorePath));
        final SSLUtil clientSSLUtil = new SSLUtil(
                new TrustStoreTrustManager(clientTrustStorePath));
        config.setListenerConfigs(
                InMemoryListenerConfig.createLDAPConfig("LDAP", // Listener name
                        null, // Listen address. (null = listen on all interfaces)
                        0, // Listen port (0 = automatically choose an available port)
                        serverSSLUtil.createSSLSocketFactory()), // StartTLS factory
                InMemoryListenerConfig.createLDAPSConfig("LDAPS", // Listener name
                        null, // Listen address. (null = listen on all interfaces)
                        0, // Listen port (0 = automatically choose an available port)
                        serverSSLUtil.createSSLServerSocketFactory(), // Server factory
                        clientSSLUtil.createSSLSocketFactory())); // Client factory
*/
        // Create and start the server instance and populate it with an initial set
        // of data from an LDIF file.
        InMemoryDirectoryServer server = new InMemoryDirectoryServer(config);
        server.importFromLDIF(true, resource.getPath());

        System.out.println(server.getListenPort());

        // Start the server so it will accept client connections.
        server.startListening();

        // Get an unencrypted connection to the server's LDAP listener, then use
        // StartTLS to secure that connection.  Make sure the connection is usable
        // by retrieving the server root DSE.
        //LDAPConnection connection = server.getConnection("LDAP");
        /*connection.processExtendedOperation(new StartTLSExtendedRequest(
                clientSSLUtil.createSSLContext()));*/
        /*LDAPTestUtils.assertEntryExists(connection, "");
        connection.close();*/

        // Establish an SSL-based connection to the LDAPS listener, and make sure
        // that connection is also usable.
        /*connection = server.getConnection("LDAPS");
        LDAPTestUtils.assertEntryExists(connection, "");
        connection.close();*/

        // Shut down the server so that it will no longer accept client
        // connections, and close all existing connections.
        //server.shutDown(true);
    }

    public static void main(String[] args) throws LDAPException, BindException {
        //startServer(port, "dc=maxcrc,dc=com", "cn=Manager,dc=maxcrc,dc=com", "secret"); // for openldap ldif
        startServer(port, "OU=Provisioning,DC=uttest,DC=itsnet,DC=bt,DC=com", "CN=superadmin,OU=Provisioning,DC=uttest,DC=itsnet,DC=bt,DC=com", "secret"); // for prov-ldif ldif
    }

    private static InMemoryDirectoryServer startServer(int port, String baseDn, String bindDn, String bindPassword) throws LDAPException, BindException {
        InMemoryListenerConfig listenerConfig = InMemoryListenerConfig.createLDAPConfig("default", port);
        InMemoryDirectoryServerConfig serverConfig = new InMemoryDirectoryServerConfig(new DN(baseDn));
    /* Ignore schema so that it does not complain that some attributes (like sAMAccountName) are not valid. */
        serverConfig.setSchema(null);
        serverConfig.setListenerConfigs(listenerConfig);
        serverConfig.addAdditionalBindCredentials(bindDn, bindPassword);
        InMemoryDirectoryServer server = new InMemoryDirectoryServer(serverConfig);
        server.importFromLDIF(true, resource.getPath());
        try {
            server.startListening();
            //server.wait(2000);
            //server.shutDown(true);
        } catch (LDAPException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //new LDIFAddChangeRecord(baseDn, new Attribute("objectClass", "domain", "top")).processChange(server);
        return server;
    }
}
