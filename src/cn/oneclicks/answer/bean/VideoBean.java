package cn.oneclicks.answer.bean;

import java.io.Serializable;

public class VideoBean implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String url;

    public VideoBean(String url) {
        super();
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
