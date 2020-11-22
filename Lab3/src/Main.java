public class Main {

    public static void main(String[] args) {
        Korotyshka Neznaika = new Korotyshka("Незнайка", 50, 10, "");
        Korotyshka Fix = new Korotyshka("Фикс", 100, 100, "");

        Fetus pear = new Fetus("Лунная груша", "дерево", "плод", "грушевый", "", 0);
        Fetus apple = new Fetus("Лунное яблоко", "дерево", "плод", "яблочный", "", 0);
        Fetus moonRaspberry = new Fetus("Лунная карликовая малина", "колючий куст", "ягода", "малиновый", "красный крошечный", 1);
        Fetus earthRaspberry = new Fetus("Земная карликовая малина", "колючий куст", "ягода", "малиновый", "", 1);
        moonRaspberry.setLocation("высокий дощатый забор");

        Clothes blazer = new Clothes("пиджак", "рыжий, протертый", PartsOfBody.UpperBody);
        Clothes cap = new Clothes("кепка", "нелепая засаленная рыжая", PartsOfBody.Head);
        Clothes pants = new Clothes("штаны", "которые обычно носят, заткнув в сапоги", PartsOfBody.LowerBody);
        Clothes sandals = new Clothes("сандалии", "одетые на босу ногу", PartsOfBody.Feet);

        Thing broom = new Thing("метла", "", "для атаки");

        Fix.wear(blazer);
        Fix.wear(cap);
        Fix.wear(pants);
        Fix.wear(sandals);

        Fix.have(broom);

        Fix.follow(Neznaika);

        Neznaika.plantThrowAway(pear);
        Neznaika.find("чем бы поживиться", "высокий дощатый забор");
        pear.saturation();
        apple.saturation();
        Neznaika.getTimeEating();

        moonRaspberry.plant();
        Neznaika.tryFetus(moonRaspberry);
        Neznaika.similarityOfTaste(moonRaspberry, earthRaspberry);
        Neznaika.eatPlant(moonRaspberry);
        Neznaika.isFull();
        Neznaika.isHungry();

        Neznaika.noticeSurveillance();

        Fix.printClothes();
        Fix.printThings();

    }
}
