package Frame;

/**
 *
 * @author Laden
 */
public class JlistCustom {
    private String text,ischeck;

    public JlistCustom(String text, String ischeck) {
        this.text = text;
        this.ischeck = ischeck;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIscheck() {
        return ischeck;
    }

    public void setIscheck(String ischeck) {
        this.ischeck = ischeck;
    }
    
}
