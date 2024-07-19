package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//{
//        "error": false,
//        "category": "Misc",
//        "type": "twopart",
//        "setup": "Why are men like lawnmowers?",
//        "delivery": "They are very hard to get started, they make yucky smells and half the time they don't even work.",
//        "flags": {
//        "nsfw": false,
//        "religious": false,
//        "political": false,
//        "racist": false,
//        "sexist": true,
//        "explicit": false
//        },
//        "id": 189,
//        "safe": false,
//        "lang": "en"
//        }
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseJokeApi {
    private Boolean error;
    private String category;
    private String type;
    private String joke;
    private String setup;
    private String delivery;
    //private Flags flags;
    //private int id;
    //private boolean safe;
    //private String lang;

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

//    public Flags getFlags() {
//        return flags;
//    }
//
//    public void setFlags(Flags flags) {
//        this.flags = flags;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public boolean isSafe() {
//        return safe;
//    }
//
//    public void setSafe(boolean safe) {
//        this.safe = safe;
//    }
//
//    public String getLang() {
//        return lang;
//    }
//
//    public void setLang(String lang) {
//        this.lang = lang;
//    }
}
