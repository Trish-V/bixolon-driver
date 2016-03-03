package hr.istratech.bixolon.driver.charset;

public class Windows1255 extends ByteCharset {
    private static final char[] lookup = new char[]{'\u0000', '\u0001', '\u0002', '\u0003', '\u0004', '\u0005', '\u0006', '\u0007', '\b', '\t', '\n', '\u000b', '\f', '\r', '\u000e', '\u000f', '\u0010', '\u0011', '\u0012', '\u0013', '\u0014', '\u0015', '\u0016', '\u0017', '\u0018', '\u0019', '\u001a', '\u001b', '\u001c', '\u001d', '\u001e', '\u001f', ' ', '!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ':', ';', '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~', '\u007f', '€', '�', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', '�', '‹', '�', '�', '�', '�', '�', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', '�', '›', '�', '�', '�', '�', ' ', '¡', '¢', '£', '₪', '¥', '¦', '§', '¨', '©', '×', '«', '¬', '\u00ad', '®', '¯', '°', '±', '²', '³', '´', 'µ', '¶', '·', '¸', '¹', '÷', '»', '¼', '½', '¾', '¿', 'ְ', 'ֱ', 'ֲ', 'ֳ', 'ִ', 'ֵ', 'ֶ', 'ַ', 'ָ', 'ֹ', '�', 'ֻ', 'ּ', 'ֽ', '־', 'ֿ', '׀', 'ׁ', 'ׂ', '׃', 'װ', 'ױ', 'ײ', '׳', '״', '�', '�', '�', '�', '�', '�', '�', 'א', 'ב', 'ג', 'ד', 'ה', 'ו', 'ז', 'ח', 'ט', 'י', 'ך', 'כ', 'ל', 'ם', 'מ', 'ן', 'נ', 'ס', 'ע', 'ף', 'פ', 'ץ', 'צ', 'ק', 'ר', 'ש', 'ת', '�', '�', '\u200e', '\u200f', '�'};

    public Windows1255() {
        super( "windows-1255", new String[]{"Windows1255", "cp1255", "cp-1255", "cp_1255", "windows1255", "windows_1255"} );
        this.lookupTable = lookup;
    }
}
