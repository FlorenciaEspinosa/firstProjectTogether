package pages;

public class CommonPage {

    public static final String XPATH_TEMPLATE_INPUTFIELD = "//*[@placeholder='%s']";
    public static final String XPATH_TEMPLATE_BUTTON = "//button[text()='%s']";
    public static final String XPATH_TEMPLATE_INVALIDCREDENTIALS = "//div[text()='%s']";
    public static final String XPATH_TEMPLATE_NUMBERS_OF_USERS_IN_TABLE = "//table[@class='table']//tbody//th";
    public static final String XPATH_TEMPLATE_SELECT ="//select[@name='%s']";
    public  static final String XPATH_TABLE_ROWS="//table[@class='table']//tbody//tr";
    public static final String XPATH_TABLE_COUNT_ROLES = "//table[@class='table']//td[text()='sdet']";
    public static final String XPATH_DEPARTMENT_ROLES_PRESENT = "(//table[@class='table']//tbody[1])[3]";
    public static final String XPATH_DEPARTMENT_TABLE_VERIFY = "//table[@class='table']//td[starts-with(text(), 'Security')]";
    public static final String XPATH_DEPARTMENT_TABLE_VERIFY2 = "//table[@class='table']//td[starts-with(text(), 'HR')]";
    public static final String XPATH_DEPARTMENT_TABLE_WITH_DEPARTMENT_COUNT = "//table[@class='table']//td[text()='Security']";
    public static final String XPATH_DEPARTMENT_TABLE_WITH_DEPARTMENT_COUNT2 = "//table[@class='table']//td[text()='HR']";
    public static final String XPATH_LIST_USERS_TABLE = "(//table[@class='table'])[3]";
    public static final String XPATH_UPDATE_USERS_BUTTON = "//table[@class='table']//tbody//td[text()='John']/parent::tr//button[1]";
    public static final String XPATH_DELETE_USERS_BUTTON = "//table[@class='table']//tbody//td[text()='TLA']/parent::tr//button[2]";
    public static final String XPATH_TEMPLATE_EDIT_USERS_INPUTFIELD = "//table[@class='table']//tbody//td//input[@name='%s']";


    public static final String XPATH_TEMPLATE_TABLE_CELL = "(//table[@class='table'])[3]//tr[%s]//td[%s]";
    public  static final String XPATH_TABLE3_ROWS="(//table[@class='table'])[3]//tbody/tr";

    public static final String XPATH_TEMPLATE_DEPARTMENT = "//table[@class='table']//tbody)[2]//tr";
    public static final String XPATH_TEMPLATE_DELETE_BUTTON_DEPARTMENT = "(//table[@class='table']//tbody)[2]//tr//td[text()='%s (']//button";
    public static final String XPATH_TEMPLATE_DELETE_BUTTON_ROLE = "(//table[@class='table']//tbody)[1]//tr//td[text()='%s (']//button";
    public static final String XPATH_TEMPLATE_ROLE = "(//table[@class='table']//tbody)[1]//tr";
    public static final String XPATH_TEMPLATE_WARNING_POPUP = "//h3[text()='Warning']";

    public static final String XPATH_TEMPLATE_ADD_ROLE = "(//table[@class='table']//tbody)[1]//tr";


}
