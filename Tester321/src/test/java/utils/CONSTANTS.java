package utils;

public class CONSTANTS {

    public static final String CONTACT_DETAILS_BIG_NOTE = "Contact Details";

    public static final String[] CONTACT_DETAILS_CHECK = {
            "First Name:",
            "Last Name:",
            "Date of Birth:",
            "Email:",
            "Phone:",
            "Street Address 1:",
            "Street Address 2:",
            "City:",
            "State or Province:",
            "Postal Code:",
            "Country:"
    };

    public static final String[] EXPECTED_HEADERS = {
            "Name",
            "Birthdate",
            "Email",
            "Phone",
            "Address",
            "City, State/Province, Postal Code",
            "Country"

    };

    public static final String CLICK_ON_ANY_CONTACT_NOTE = "Click on any contact" +
            " to view the Contact Details";

    public static final String SIGH_UP_MESSAGE =
            "Sign up to begin adding your contacts!";



    private CONSTANTS() {
        // Utility class: запрещаем создание объекта
    }
}