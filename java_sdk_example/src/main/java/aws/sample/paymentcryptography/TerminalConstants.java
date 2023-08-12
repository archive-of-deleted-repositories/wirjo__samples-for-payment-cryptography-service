package aws.sample.paymentcryptography;

public interface TerminalConstants extends CommonConstants{
    
    public final String PIN_MASK = "00000000000000FF00000000000000FF";

    // Pre-calculated this outside the code for brevity. KSN FFFF9876543210E00001 was used to derive this key
    public final String DUKPT_CURRENT_KEY = "***REMOVED***";
    
    public final String MAC_KEY_PLAIN_TEXT = "***REMOVED***";

    // Clear text PEK key.
    public final String PEK = "***REMOVED***";

    public final String ALGORITHM = "DESede"; // Same as TripleDES
    public final String NO_PADDING = "NoPadding";
    public final String PKCS_PADDING = "PKCS5Padding";
    public final String TRANSFORMATION = ALGORITHM + "/" + MODE + "/" + NO_PADDING;

    public final String TRANSFORMATION_WITH_PKCS5_PADDING = ALGORITHM + "/" + MODE + "/" + PKCS_PADDING;
}
