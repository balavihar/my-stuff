package com;

import com.unboundid.ldap.sdk.AddRequest;
import com.unboundid.ldap.sdk.LDAPConnection;
import com.unboundid.ldap.sdk.LDAPConnectionOptions;
import com.unboundid.ldap.sdk.LDAPException;
import com.unboundid.ldif.LDIFException;

/**
 * Created by guptab4 on 3/6/2017.
 */
public class AddUsersToAD {

    /**
     * demonstrate the {@link AddRequest}
     *
     * @throws LDIFException
     * @throws LDAPException
     */
    public static void main(final String... args) throws LDAPException,LDIFException
    {
    /*
     * Use connection options to specify that the connection attempt
     * should be 1 second and if the ADD request times out, the request
     * should be abandoned
     */
        final LDAPConnectionOptions connectionOptions =
                new LDAPConnectionOptions();
        connectionOptions.setAbandonOnTimeout(true);
        int connectionTimeoutMillis = 1000;
        connectionOptions.setConnectTimeoutMillis(connectionTimeoutMillis);

    /*
     * LDIF lines for the add request
     */
        final String[] ldifLines =
                {

                        "dn: CN=tony,OU=Provisioning,DC=uttest,DC=itsnet,DC=bt,DC=com",
                        "objectClass: user",
                        "objectClass: organizationalPerson",
                        "objectClass: person",
                        "objectClass: top",
                        "accountExpires: 9223372036854775807",
                        "badPasswordTime: 131320784761092929",
                        "badPwdCount: 1",
                        "cn: Tony Baines",
                        "codePage: 0",
                        "countryCode: 0",
                        "displayName: tony",
                        "distinguishedName: CN=tony,OU=Provisioning,DC=uttest,DC=itsnet,DC=bt,DC=com",
                        "dSCorePropagationData: 16010101000000.0Z",
                        "givenName: tony",
                        "instanceType: 4",
                        "lastLogoff: 0",
                        "lastLogon: 131316133366288905",
                        "lastLogonTimestamp: 131327379057626121",
                        "logonCount: 0",
                        "memberOf: CN=Trader-ui-users,OU=Provisioning,DC=uttest,DC=itsnet,DC=bt,DC=com",
                        "name: tony",
                        "objectCategory: CN=Person,CN=Schema,CN=Configuration,DC=uttest,DC=itsnet,DC=bt,DC=com",
                        "objectGUID:: VO+/vVRI77+9CO+/vU3vv70E77+92pbdoe+/vQ==",
                        "objectSid:: AQUAAAAAAAUVAAAADG0+DO+/ve+/vRMk77+9Le+/vULvv70MAAA=",
                        "primaryGroupID: 513",
                        "pwdLastSet: 131314559461618770",
                        "sAMAccountName: tony",
                        "sAMAccountType: 805306368",
                        "userAccountControl: 66048",
                        "userPrioncipalName: tony@uttest.itsnet.bt.com",
                        "userPassword:: dG9ueTEyMzQ=",
                        "uSNChanged: 231760",
                        "uSNCreated: 230021",
                        "whenChanged: 20170228064505.0Z",
                        "whenCreated: 20170213103906.0Z"

                        /*"dn: CN=tony,OU=Provisioning,DC=uttest,DC=itsnet,DC=bt,DC=com",
                        "changetype: add",
                        "cn: Tony Baines",
                        "sn: tony",
                        "uid: tony",
                        "userPassword:: tony1234"*/
                };

        final String host = "localhost";
        final int port = 341;

        LDAPConnection ldapConnection =
                new LDAPConnection(connectionOptions,host,port);
        ldapConnection.add(new AddRequest(ldifLines));
        ldapConnection.close();
    }

}
/*
        "dn: CN=tony,OU=Provisioning,DC=uttest,DC=itsnet,DC=bt,DC=com",
        "objectClass: user",
        "objectClass: organizationalPerson",
        "objectClass: person",
        "objectClass: top",
        "accountExpires: 9223372036854775807",
        "badPasswordTime: 131320784761092929",
        "badPwdCount: 1",
        "cn: tony",
        "codePage: 0",
        "countryCode: 0",
        "displayName: tony",
        "distinguishedName: CN=tony,OU=Provisioning,DC=uttest,DC=itsnet,DC=bt,DC=com",
        "dSCorePropagationData: 16010101000000.0Z",
        "givenName: tony",
        "instanceType: 4",
        "lastLogoff: 0",
        "lastLogon: 131316133366288905",
        "lastLogonTimestamp: 131327379057626121",
        "logonCount: 0",
        "memberOf: CN=Trader-ui-users,OU=Provisioning,DC=uttest,DC=itsnet,DC=bt,DC=com",
        "name: tony",
        "objectCategory: CN=Person,CN=Schema,CN=Configuration,DC=uttest,DC=itsnet,DC=bt,DC=com",
        "objectGUID:: VO+/vVRI77+9CO+/vU3vv70E77+92pbdoe+/vQ==",
        "objectSid:: AQUAAAAAAAUVAAAADG0+DO+/ve+/vRMk77+9Le+/vULvv70MAAA=",
        "primaryGroupID: 513",
        "pwdLastSet: 131314559461618770",
        "sAMAccountName: tony",
        "sAMAccountType: 805306368",
        "userAccountControl: 66048",
        "userPrincipalName: tony@uttest.itsnet.bt.com",
        "uSNChanged: 231760",
        "uSNCreated: 230021",
        "whenChanged: 20170228064505.0Z",
        "whenCreated: 20170213103906.0Z"
*/
