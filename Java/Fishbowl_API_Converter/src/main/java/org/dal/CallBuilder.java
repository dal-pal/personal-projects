package org.dal;

import org.apache.commons.lang3.StringUtils;

public class CallBuilder {

    public CallBuilder(String path, String lineStrings) {
    }

    public String callBuilder(String path, String csvData) {
        String type = StringUtils.substringBefore(path.substring(path.lastIndexOf("\\") + 1),".");

        String call = "{" +
            "\n\t\"FbiJson\": {" +
            "\n\t\t\"Ticket\": {" +
            "\n\t\t\t\"Key\": \"\"" +
            "\n\t\t}," +
            "\n\t\t\"FbiMsgsRq\": {" +
            "\n\t\t\"ImportRq\": {" +
            "\n\t\t\t\"Type\": \"Import" + type + "\"," +
            "\n\t\t\t\"Rows\": {" +
            "\n\t\t\t\t\"Row\": [\n" + csvData + "]" +
            "\n\t\t\t\t}" +
            "\n\t\t\t}" +
            "\n\t\t}" +
            "\n\t}" +
            "\n}";

        return call;
    }

}
