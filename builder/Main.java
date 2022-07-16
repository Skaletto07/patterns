package patterns.builder;

import patterns.builder.basket.DirectorBasket;
import patterns.builder.basket.SomeMarket;
import patterns.builder.industryUnit.DirectorIndustry;
import patterns.builder.industryUnit.HeavyIndustrialUnitBuilder;
import patterns.builder.industryUnit.LightIndustrialUnitBuilder;
import patterns.builder.lombokBuilder.ReportLombokBuilder;
import patterns.builder.reportBuilder.Report;

public class Main {
    public static void main(String[] args) {


        ReportLombokBuilder reportLombokBuilder = ReportLombokBuilder
                .builder()
                .header("What")
                .title("About")
                .page(5)
                .build();
        System.out.println(reportLombokBuilder);

        DirectorIndustry directorLightIndustry = new DirectorIndustry();
        directorLightIndustry.setBuilder(new LightIndustrialUnitBuilder());
        System.out.println(directorLightIndustry.buildIndustrialUnit());

        DirectorIndustry directorHeavyIndustry = new DirectorIndustry();
        directorHeavyIndustry.setBuilder(new HeavyIndustrialUnitBuilder());
        System.out.println(directorHeavyIndustry.buildIndustrialUnit());

        Report report = new Report.Builder("Quarterly report")
                .setTitle("Title")
                .setContent("Something")
                .setTable("Table")
                .setPageNumber(2)
                .build();
        System.out.println(report);

        DirectorBasket basketOnMarket = new DirectorBasket();
        basketOnMarket.setBuilder(new SomeMarket());
        System.out.println(basketOnMarket.buildBasket());


    }
}
