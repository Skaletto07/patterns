package patterns.builder.androidExample;

public class Computer {

    static class PC {
       final private String frame;
       final private String cooler;
       final private String video;
       final private String motherboard;
       final private String RAM;
       final private String powerUnit;
       final private String CPU;

        public PC(Builder builder) {
            this.frame = builder.frame;
            this.cooler = builder.cooler;
            this.video = builder.video;
            this.motherboard = builder.motherboard;
            this.RAM = builder.RAM;
            this.powerUnit = builder.powerUnit;
            this.CPU = builder.CPU;
        }

        @Override
        public String toString() {
            return "PC{" +
                    "frame='" + frame + '\'' +
                    ", cooler='" + cooler + '\'' +
                    ", videoСard='" + video + '\'' +
                    ", motherboard='" + motherboard + '\'' +
                    ", RAM='" + RAM + '\'' +
                    ", powerUnit='" + powerUnit + '\'' +
                    ", CPU='" + CPU + '\'' +
                    '}';
        }

        public String getFrame() {
            return frame;
        }

        public String getCooler() {
            return cooler;
        }

        public String getVideo() {
            return video;
        }

        public String getMotherboard() {
            return motherboard;
        }

        public String getRAM() {
            return RAM;
        }

        public String getPowerUnit() {
            return powerUnit;
        }

        public String getCPU() {
            return CPU;
        }

        static class Builder {
            private String frame;
            private String cooler;
            private String video;
            private String motherboard;
            private String RAM;
            private String powerUnit;
            private String CPU;

            public PC build() {
                return new PC(this);
            }

            public Builder setFrame(String frame) {
                this.frame = frame;
                return this;
            }

            public Builder setCooler(String cooler) {
                this.cooler = cooler;
                return this;
            }

            public Builder setVideoCard(String video) {
                this.video = video;
                return this;
            }

            public Builder setMotherboard(String motherboard) {
                this.motherboard = motherboard;
                return this;
            }

            public Builder setRAM(String ram) {
                this.RAM = ram;
                return this;
            }

            public Builder setPowerUnit(String powerUnit) {
                this.powerUnit = powerUnit;
                return this;
            }

            public Builder setCPU(String cpu) {
                this.CPU = cpu;
                return this;
            }
        }
    }

    public static void main(String[] args) {
        PC pc = new PC.Builder()
                .setFrame("aerocool")
                .setCPU("Intel")
                .setCooler("Zalman")
                .setMotherboard("MSI")
                .setPowerUnit("Thermaltake")
                .setVideoCard("Nvidia")
                .setRAM("Corsar")
                .build();
        System.out.println(pc);


    }
}
