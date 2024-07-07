package dev.manyroads.documentbuilder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadXML {

    private static final String XML = "<?xml version=\"1.0\"?>\n"
            + "<GET_GUESS_CHART>"
            + "    <sort_by_letter>"
            + "        <letter_row>"
            + "            <letter>A</letter>"
            + "            <guess>16</guess>"
            + "            <rank>3</rank>"
            + "        </letter_row>"
            + "        <letter_row>"
            + "            <letter>B</letter>"
            + "            <guess>5</guess>"
            + "            <rank>1</rank>"
            + "        </letter_row>"
            + "        <letter_row>"
            + "            <letter>C</letter>"
            + "            <guess>13</guess>"
            + "            <rank>2</rank>"
            + "        </letter_row>"
            + "    </sort_by_letter>"
            + "    <sort_by_rank>"
            + "        <letter_row>"
            + "            <letter>A</letter>"
            + "            <guess>16</guess>"
            + "            <rank>1</rank>"
            + "        </letter_row>"
            + "        <letter_row>"
            + "            <letter>E</letter>"
            + "            <guess>15</guess>"
            + "            <rank>2</rank>"
            + "        </letter_row>"
            + "    </sort_by_rank>"
            + "</GET_GUESS_CHART>";

    static List<String> printXML(String xml) {

        // split by 1 or more spaces
        String regex = "\s+";
        return List.of(xml.split(regex));
    }

    static Document buildDocument() {

        Document doc = null;

        // Build the document
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(new ByteArrayInputStream(XML.getBytes()));
            System.out.println("doc: " + doc);

        } catch (ParserConfigurationException | org.xml.sax.SAXException | java.io.IOException ex) {
            System.out.println("Error building document: " + ex.getMessage());
        }
        return doc;
    }

    static List<String> sortNodes(NodeList nodes) {

        List<String> letters = new ArrayList<>();

        for (int i = 0; i < nodes.getLength(); i++) {

            Node node = nodes.item(i);
            letters.add(String.valueOf(node.getChildNodes().getLength()));
        }
        return letters;
    }

    public static void main(String[] args) throws Exception {

        // Create node list
        NodeList rootElement = buildDocument().getChildNodes();
        NodeList sortByNodes = rootElement.item(0).getChildNodes();

        printXML(XML).forEach(s -> System.out.printf("%s\n", s));
        System.out.println();
        sortNodes(sortByNodes).forEach(System.out::println);
  /*
        for (int k = 0; k < sortByNodes.getLength(); k++) {
            Node sortBy = sortByNodes.item(k);


            System.out.println("SORT BY: " + sortBy.getNodeName());

            NodeList letterRows = sortBy.getChildNodes();

            for (int j = 0; j < letterRows.getLength(); j++) {
                Node letterRow = letterRows.item(j);
                NodeList letterRowDetails = letterRow.getChildNodes();

                if (letterRowDetails.getLength() > 0) {
                    String letter = null;
                    String guess = null;
                    String rank = null;

                    for (int i = 0; i < letterRowDetails.getLength(); i++) {
                        Node detail = letterRowDetails.item(i);

                        if (detail.getNodeName().equals("letter")) {
                            letter = detail.getTextContent();
                        } else if (detail.getNodeName().equals("guess")) {
                            guess = detail.getTextContent();
                        } else if (detail.getNodeName().equals("rank")) {
                            rank = detail.getTextContent();
                        }
                    }

                    System.out.println("Letter=" + letter + ", guess=" + guess + ", rank=" + rank);
                }
            }
        }
   */
    }
}
