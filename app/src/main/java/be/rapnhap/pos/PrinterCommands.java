package be.rapnhap.pos;

public class PrinterCommands {

    public static byte[] INIT = {27, 64}; // Initialize printer
    public static byte[] RESET = {24}; // Cancel print data in Page mode
    public static final byte[] AUTO_POWER_OFF = {27,77,55,54,53,52,48,13};
    public static byte[] SELECT_FONT_A = {27, 33, 0}; // Select print mode
    public static byte[] FONT_DOUBLE = {29, 33,  0x11};//Select character size  (horizontal (times 2) x vertical (times 2)
    public static byte[] FONT_SINGLE = {29, 33,  0x00};//Select character size  (horizontal (times 1) x vertical (times 1)
    public static byte[] INTERNATIONAL_FRENCH = {27, 82, 0x01}; // set International
    public static byte[] SELECT_FONT_12 = {27, 75, 49, 13};
    public static byte[] SELECT_FONT_25 = {27, 75, 49, 49, 13};
    public static byte[] FONT_BOLD_ON = {27, 69, 1}; // Turn emphasized mode on
    public static byte[] FONT_BOLD_OFF = {27, 69, 0}; // Turn emphasized mode off
    public static byte[] FEED_3_LINES = {27, 100, 3}; // Print and line feed (3 times)
    public static byte[] FONT_UNDERLINE_ON = {27, 85, 85};
    public static byte[] FONT_UNDERLINE_OFF = {27, 85, 117};
    public static byte[] FONT_HI_ON = {28};
    public static byte[] FONT_HI_OFF = {29};
    public static byte[] FONT_WIDE_ON = {14};
    public static byte[] FONT_WIDE_OFF = {15};
    public static byte[] CHAR_SET = {27, 70, 49};
    public static byte[] PRINT_LEFT = {27, 70, 76};
    public static byte[] PRINT_RIGHT = {27, 70, 86};
    public static byte[] SET_BAR_CODE_HEIGHT = {29, 104, 100};
    public static byte[] PRINT_BAR_CODE_1 = {29, 107, 2};
    public static byte[] SEND_NULL_BYTE = {0x00};
    public static byte[] SELECT_PRINT_SHEET = {0x1B, 0x63, 0x30, 0x02};
    public static byte[] PAPER_CUT = {29, 86, 48}; // Select cut mode and cut paper Function A full cut
    public static byte[] SELECT_CYRILLIC_CHARACTER_CODE_TABLE = {0x1B, 0x74, 0x11};

}


