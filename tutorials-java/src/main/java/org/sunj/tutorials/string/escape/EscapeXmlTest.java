package org.sunj.tutorials.string.escape;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EscapeXmlTest {

  private static final String XML_TO_ESCAPE =
      "<note><to>Tove</to><from>Jani</from><heading>Reminder</heading><body>Don't forget me this weekend!</body></note>";

  private static final String ESCAPED_XML =
      "&lt;note&gt;&lt;to&gt;Tove&lt;/to&gt;&lt;from&gt;Jani&lt;/from&gt;&lt;heading&gt;Reminder&lt;/heading&gt;&lt;body&gt;Don&apos;t forget me this weekend!&lt;/body&gt;&lt;/note&gt;";

  @Test
  public void excapeXml() {
    StringBuilder escapedXML = new StringBuilder();
    for (int i = 0; i < XML_TO_ESCAPE.length(); i++) {
      char c = XML_TO_ESCAPE.charAt(i);
      switch (c) {
        case '<':
          escapedXML.append("&lt;");
          break;
        case '>':
          escapedXML.append("&gt;");
          break;
        case '\"':
          escapedXML.append("&quot;");
          break;
        case '&':
          escapedXML.append("&amp;");
          break;
        case ' ':
          escapedXML.append("&apos;");
          break;
        default:
          if (c > 0x7e) {
            escapedXML.append("&#" + ((int) c) + ";");
          } else
            escapedXML.append(c);
      }
    }
    System.out.println("originalXml : " + XML_TO_ESCAPE);
    System.out.println("excapedXml : " + escapedXML.toString());
    assertEquals(ESCAPED_XML, escapedXML.toString());
  }
}
