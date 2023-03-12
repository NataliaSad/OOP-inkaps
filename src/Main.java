import java.util.Random;
public class Main {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        GryffindorPeople harry = generateGryffindorPeople("Гарри Поттер");
        GryffindorPeople ron = generateGryffindorPeople("Рон Уизли");
        GryffindorPeople germiona = generateGryffindorPeople("Гермиона Грейнджер");
        RavenclawPeople dgoy = generateRavenclawPeople ("Чжоу Чанг");
        RavenclawPeople padma = generateRavenclawPeople ("Падма Патил");
        RavenclawPeople mark = generateRavenclawPeople (" Маркус Белби");
        SlytherinPeople draco = generateSlytherinPeople(" Драко Малфей");
        SlytherinPeople grehem = generateSlytherinPeople("  Грэхэм Монтегю");
        SlytherinPeople gergio = generateSlytherinPeople(" Грегори Гойл");
        HufflepuffPeople cedric =  generateHufflepuffPeople("Седрик Диггори");
        HufflepuffPeople zaharia =  generateHufflepuffPeople("Захария Смит");
        HufflepuffPeople dgastin =  generateHufflepuffPeople("Джастин Финч-Флетчли");

        harry.print();
        ron.print();
        germiona.print();
        dgoy.print();
        padma.print();
        mark.print();
        draco.print();
        grehem.print();
        gergio.print();
        cedric.print();
        zaharia.print();
        dgastin.print();

        harry.compareHogwards(draco);
        harry.compareGryffindor(ron);
    }
    private static GryffindorPeople generateGryffindorPeople(String name) {
        return new GryffindorPeople(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static RavenclawPeople generateRavenclawPeople(String name) {
        return new RavenclawPeople(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));

    }
    private static HufflepuffPeople generateHufflepuffPeople(String name) {
        return new HufflepuffPeople(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));

    }
    private static SlytherinPeople generateSlytherinPeople(String name) {
        return new SlytherinPeople(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));}

}
