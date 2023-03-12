public class HufflepuffPeople extends HogwardsPeople {
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffPeople(String name,
                            int magic,
                            int transgression,
                            int diligence,
                            int loyalty,
                            int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }


    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int ability() {
        return diligence + loyalty + honesty;
    }
    public void compareHufflepuff(HufflepuffPeople hufflepuffPeople) {
        int ability1 = ability();
        int ability2 = hufflepuffPeople.ability();
        if (ability1 > ability2) {
            System.out.printf(
                    "Пуффендуец %s лучше, чем пуффендуец %s: %d VS %d%n",
                    getName(),
                    hufflepuffPeople.getName(),
                    ability1,
                    ability2
            );
        } else if (ability2 > ability1) {
            System.out.printf("Пуффендуец %s лучше, чем пуффендуец %s: %d VS %d%n", hufflepuffPeople.getName(),
                    getName(),
                    ability2,
                    ability1);
        } else {
            System.out.printf("Пуффендуец %s такой же, как пуффендуец %s: %d VS %d%n",
                    hufflepuffPeople.getName(),
                    getName(),
                    ability1,
                    ability2);
        }
    }
    @Override
    public  String toString() {
        return String.format("%s; трудолюбие : %d; верность: %d; честность: %d",super.toString(), diligence, loyalty, honesty);
    }
}
