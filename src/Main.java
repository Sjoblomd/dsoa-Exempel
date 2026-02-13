public class Main {

    public static void main(String[] args) {

        String[] testData = {
                "Harley-Davidson",
                "Honda",
                "Yamaha",
                "Kawasaki",
                "Suzuki",
                "Ducati",
                "BMW Motorrad",
                "KTM",
                "Triumph",
                "Aprilia",
                "Moto Guzzi",
                "Indian Motorcycle",
                "Royal Enfield",
                "MV Agusta",
                "Benelli",
                "Husqvarna",
                "GasGas",
                "Zero Motorcycles",
                "CFMoto",
                "Bajaj",
                "Hero MotoCorp",
                "TVS Motor",
                "Mahindra Two Wheelers",
                "Lifan",
                "Zontes",
                "Keeway",
                "Kymco",
                "SYM",
                "Vespa",
                "Piaggio",
                "Norton",
                "Bimota",
                "Beta Motor",
                "Sherco",
                "Ural",
                "Victory Motorcycles",
                "Energica",
                "Lightning Motorcycle",
                "Alta Motors",
                "Hyosung",
                "Daelim",
                "Rieju",
                "Mondial",
                "Fantic",
                "SWM",
                "Can-Am",
                "Sachs",
                "Derbi",
                "AJP",
                "Cleveland CycleWerks",
                "Moto Morini",
                "Voge",
                "QJMotor",
                "Haojue",
                "Loncin",
                "Skyteam",
                "Mash Motors",
                "Buell",
                "Arc Motorcycle",
                "Super Soco",
                "Horwin",
                "NIU",
                "Yadea",
                "Sinnis",
                "Lambretta",
                "Brough Superior",
                "Boss Hoss",
                "Big Dog Motorcycles",
                "Confederate Motorcycles",
                "CCM Motorcycles",
                "Herald Motor Co",
                "Macbor",
                "FB Mondial",
                "Zündapp",
                "Jawa",
                "CZ",
                "Ather Energy",
                "Ola Electric",
                "Evoke Motorcycles",
                "Tacita",
                "Brutus Motorcycle",
                "Motus Motorcycles",
                "Ecosse Moto Works",
                "Midual",
                "Janus Motorcycles",
                "SSR Motorsports",
                "Rokon",
                "American IronHorse",
                "Yamaha Star",
                "Kawasaki Ninja",
                "Honda Gold Wing",
                "Suzuki Hayabusa",
                "Ducati Panigale",
                "BMW GS",
                "Triumph Bonneville",
                "KTM Duke",
                "Aprilia RSV4",
                "Royal Enfield Bullet"
        };

        Queuey q = new Queuey();
        q.enqueue("Smok");
        q.enqueue("Jack");
        q.enqueue("Smoug");
        q.dequeue();
        q.enqueue("Dogge");
        System.out.println(q);

        String[] weekDays = {"må", "ti", "on", "to", "fr", "lö", "sö"};

        int today = 5;

        System.out.printf("Idag är det %s%n", weekDays[today]);
        System.out.printf("I övermorgon är det %s%n", weekDays[(today + 2) % weekDays.length]);


        CC_Circular_Arr.cirDays(weekDays, today, 6);
        CC_Circular_Arr.cirDays(weekDays, today, 15);


        Stacky stacky = new Stacky(5);
        stacky.push(testData[3]);
        stacky.push(testData[4]);
        stacky.push(testData[5]);
        stacky.push(testData[8]);
        stacky.push(testData[1]);
        System.out.println(stacky);
        System.out.println("pop: " + stacky.pop());
        System.out.println("pop: " + stacky.pop());
        stacky.push(testData[2]);
        stacky.push(testData[0]);
        System.out.println(stacky);

        Linky linky = new Linky();
        linky.add(new Person(testData[3]));
        linky.add(new Person(testData[4]));
        linky.add(new Person(testData[5]));
        linky.add(new Person(testData[8]));
        System.out.println(linky.toString());
        System.out.println("linky size: " + linky.size());

        Person p1 = new Person(testData[0]);
        Person p2 = new Person(testData[1], p1);
        Person p3 = new Person(testData[2], p2);
        Person p4 = new Person(testData[3], p3);

        Person pMid = new Person("mid-person", p2);
        p3.next = pMid;

        Person current = p4;
        while (current != null) {
            System.out.println("Current Name: " + current.getName());
            current = current.next;
        }

        StringArray names = new StringArray(testData);

        System.out.println(names.toString());
        names.append("Monke");
        System.out.println(names.toString());
        names.insert(4, "DERBI");
        System.out.println(names.toString());
        names.reverse();
        System.out.println(names.toString());

        new BigO();
    }
}