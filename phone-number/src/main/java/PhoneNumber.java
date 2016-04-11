public class PhoneNumber {

    private String number;

    public PhoneNumber(String inputNumber) {
        number = formatPhoneNumber(inputNumber);
    }

    private String formatPhoneNumber(String number) {
        String formattedNumber = number.replaceAll("\\D", "");
        if (formattedNumber.length() != 10) {
            if (formattedNumber.length() == 11 && formattedNumber.startsWith("1")) {
                formattedNumber = formattedNumber.substring(1);
            } else {
                formattedNumber = "0000000000";
            }
        }
        return formattedNumber;
    }

    public String getNumber() {
        return number;
    }

    public String getAreaCode() {
        return number.substring(0, 3);
    }

    public String pretty() {
        return String.format("(%s) %s-%s", number.substring(0, 3), number.substring(3, 6), number.substring(6, 10));
    }

}
