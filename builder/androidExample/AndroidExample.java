package patterns.builder.androidExample;

public class AndroidExample {

    record AlertDialog(String title, String message, String icon, boolean cancelable) {

        public String getTitle() {
            return title;
        }

        public String getMessage() {
            return message;
        }

        public String getIcon() {
            return icon;
        }

        public boolean isCancelable() {
            return cancelable;
        }

        public void show() {
            System.out.println(this);
        }

        @Override
        public String toString() {
            return "AlertDialog{" +
                    "title='" + title + '\'' +
                    ", message='" + message + '\'' +
                    ", icon='" + icon + '\'' +
                    ", cancelable=" + cancelable +
                    '}';
        }

        static class Builder {

            private String title;
            private String message;
            private String icon;
            private boolean cancelable;

            public Builder(Object o) {
            }

            public AlertDialog create() {
                return new AlertDialog(title, message, icon, cancelable);
            }

            public Builder setTitle(String title) {
                this.title = title;
                return this;
            }

            public Builder setMessage(String message) {
                this.message = message;
                return this;
            }

            public Builder setIcon(String icon) {
                this.icon = icon;
                return this;
            }

            public Builder setCancelable(boolean cancelable) {
                this.cancelable = cancelable;
                return this;
            }


        }
    }

    public static void main(String[] args) {
        AlertDialog.Builder builder = new AlertDialog.Builder(null);
        builder.setTitle("title")
                .setMessage("message")
                .setIcon("icom")
                .setCancelable(true);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
