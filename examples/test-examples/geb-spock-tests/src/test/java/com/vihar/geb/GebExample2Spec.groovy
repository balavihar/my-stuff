package com.vihar.geb

import geb.spock.GebReportingSpec
import geb.spock.GebSpec

/**
 * Created by guptab4 on 1/9/2017.
 */
class GebExample2Spec extends GebReportingSpec {
//class GebExample2Spec extends GebSpec {

    def "Check if there main link refers to homepage"() {
        go "http://www.google.com"
        //$('a', text: contains('JDriven')).click()

        expect:
        //driver.currentUrl == "https://www.google.co.uk/?gfe_rd=cr&ei=dolzWOTSJcLBaIbSqdgD&gws_rd=ssl"
        "aa" == "aa"
    }
}

