package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//⇒ {
//        "text": "2012 is the year that the century's second and last solar transit of Venus occurs on June 6.",
//        "found": true,
//        "number": 2012,
//        "type": "year",
//        "date": "June 6"
//        }
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseMathApi {
    private String text;
   // private boolean found;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

//    public boolean isFound() {
//        return found;
//    }
//
//    public void setFound(boolean found) {
//        this.found = found;
//    }
}
