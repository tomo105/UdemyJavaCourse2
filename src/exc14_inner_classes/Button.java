package exc14_inner_classes;

public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public void onClick() {
        this.onClickListener.onClick(this.title);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public interface OnClickListener {
        public void onClick(String title);
    }
}
