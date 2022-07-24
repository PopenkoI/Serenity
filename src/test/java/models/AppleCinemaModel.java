package models;

public class AppleCinemaModel {
    private int radio;// 5 or 6 or 7
    private int checkbox;// 8 or 9 or 10 or 11
    private String text;
    private int select; // 1 or 2 or 3 or 4
    private String textarea;
    private String file;
    private String date;
    private String time;
    private String dateAndTime;
    private String qty;

    AppleCinemaModel() {
    }

    public static AppleCinemaModel.Builder getBuilder() {
        return new AppleCinemaModel().new Builder();
    }

    public class Builder {
        public AppleCinemaModel.Builder radio(int value) {
            radio = value;
            return this;
        }

        public AppleCinemaModel.Builder checkbox(int value) {
            checkbox = value;
            return this;
        }

        public AppleCinemaModel.Builder text(String value) {
            text = value;
            return this;
        }

        public AppleCinemaModel.Builder select(int value) {
            select = value;
            return this;
        }

        public AppleCinemaModel.Builder textarea(String value) {
            textarea = value;
            return this;
        }

        public AppleCinemaModel.Builder file(String value) {
            file = value;
            return this;
        }

        public AppleCinemaModel.Builder date(String value) {
            date = value;
            return this;
        }

        public AppleCinemaModel.Builder time(String value) {
            time = value;
            return this;
        }

        public AppleCinemaModel.Builder dateAndTime(String value) {
            dateAndTime = value;
            return this;
        }

        public AppleCinemaModel.Builder qty(String value) {
            qty = value;
            return this;
        }

        public AppleCinemaModel build() {
            return AppleCinemaModel.this;
        }
    }


    public int getRadio() {
        return radio;
    }

    public int getCheckbox() {
        return checkbox;
    }

    public String getText() {
        return text;
    }

    public int getSelect() {
        return select;
    }

    public String getTextarea() {
        return textarea;
    }

    public String getFile() {
        return file;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public String getQty() {
        return qty;
    }
}

