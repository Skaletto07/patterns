package patterns.builder.lombokBuilder;

import lombok.Builder;

@Builder
public class ReportLombokBuilder {
    private String header;
    private String title;
    private int page;


    public String getHeader() {
        return header;
    }

    public String getTitle() {
        return title;
    }

    public int getPage() {
        return page;
    }

    @Override
    public String toString() {
        return "ReportLombokBuilder{" +
                "header='" + header + '\'' +
                ", title='" + title + '\'' +
                ", page=" + page +
                '}';
    }
}
