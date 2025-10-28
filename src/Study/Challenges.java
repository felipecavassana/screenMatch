package Study;

import Study.model.*;

import java.util.*;

public class Challenges {
    public static void main(String[] args) {
        // People
        System.out.println("\n*** [PEOPLE] ***");
        People people1 = new People();
        people1.setName("Felipe");
        people1.setAge(37);
        people1.sayHello();
        System.out.println("A pessoa "+ people1.getName() +" tem "+ people1.getAge() +" anos");
        people1.isMajor();

        People people2 = new People();
        people2.setName("Patrícia");
        people2.setAge(34);
        people2.sayHello();

        People people3 = new People();
        people3.setName("Maria Beatriz");
        people3.setAge(2);
        people3.sayHello();

        ArrayList<People> listPeople = new ArrayList<>();
        listPeople.add(people1);
        listPeople.add(people2);
        listPeople.add(people3);

        System.out.println("Size "+listPeople.size());

        for (People people : listPeople){
            System.out.println(people);
        }
        System.out.println("*** [END] ***\n");

        // Calculator
        System.out.println("\n*** [CALCULATOR] ***");
        Calculador newCalculador = new Calculador();
        int doubleNumber = newCalculador.doubleNumber(10);
        System.out.println(doubleNumber);
        System.out.println("*** [END] ***\n");

        // Music
        System.out.println("\n*** [MUSIC] ***");
        Music newMusic = new Music();
        newMusic.title = "Logo eu";
        newMusic.artist = "Jorge e Mateus";
        newMusic.yearRelease = 2019;
        newMusic.evaluateMusic(10);
        newMusic.evaluateMusic(10);
        newMusic.evaluateMusic(9);

        newMusic.showInfo();
        System.out.println("*** [END] ***\n");

        // Cars
        System.out.println("\n*** [CAR] ***");
        CarModel myCar = new CarModel();
        myCar.setModel("Sandero GT Line");
        myCar.setYear(2018);
        myCar.setColor("White");
        myCar.definePrices(55000, 60000, 75000);

        myCar.showInfos();
        System.out.println("Age car: " + myCar.calculateTime() + " years");
        System.out.println("*** [END] ***\n");

        // Students
        System.out.println("\n*** [STUDENTS] ***");
        Student myStudent = new Student();
        myStudent.setName("Patricia");
        myStudent.setAge(34);
        List<Double> doubles = Arrays.asList(3.5, 7.5, 4.3, 4.7, 5.1);
        myStudent.setNotes(doubles);
        myStudent.showInfo();
        myStudent.getGradeAverage();


        // Products
        System.out.println("\n*** [PRODUCT] ***");

        Product product1 = new Product("Fralda GG",3.49, 15);
        System.out.println("Produto "+ product1.getName() +" com o valor de $ "+ product1.getPrice());
        product1.applyDiscount(10);
        System.out.println("Com o desconto de 10% fica: $ "+ product1.getPrice());

        Product product2 = new Product("Lenço Umedecido",2.99, 10);

        PerishableProduct perishableProduct1 = new PerishableProduct("Morango", 1.79, 2, "30/10/2025");

        ArrayList<Product> productArrayList = new ArrayList<>();
        productArrayList.add(product1);
        productArrayList.add(product2);
        productArrayList.add(perishableProduct1);
        System.out.println("Cart size: "+ productArrayList.size());
        System.out.println("First product: "+ productArrayList.getFirst().getName());

        double totalCartAmount = 0;
        for (Product product : productArrayList){
            System.out.println(product);
            totalCartAmount += product.getPrice();
        }
        System.out.println(String.format("Cart average: $ %.2f", totalCartAmount/ productArrayList.size()));

        System.out.println("*** [END] ***\n");


        // Books
        System.out.println("\n*** [BOOK] ***");
        Book book1 = new Book();
        book1.setAuthor("Fernando Pessoa");
        book1.setTitle("O impossivel aos seus olhos");
        book1.showInfo();
        System.out.println("*** [END] ***\n");

        // Animals
        System.out.println("\n*** [ANIMAL] ***");
        Dog dog = new Dog();
        dog.abanarRabo();
        dog.makeSound();

        if (dog instanceof Animal animal){
            animal.makeSound();
        }

        Cat cat = new Cat();
        cat.arranharMoveis();
        cat.makeSound();
        System.out.println("*** [END] ***\n");


        // BankAccount
        System.out.println("\n*** [BANK ACCOUNT] ***");
        CurrentAccount account = new CurrentAccount("Conta Inicial", 123321, 1000);
        account.consultarSaldo();

        account.depositar(200);
        account.consultarSaldo();
        account.setTarifaMensal(15.50);
        account.cobrarTarifaMensal();

        account.sacar(120);
        account.consultarSaldo();

        CurrentAccount account1 = new CurrentAccount("Conta 1", 123331, 500);
        CurrentAccount account2 = new CurrentAccount("Conta 2", 123332, 501);
        CurrentAccount account3 = new CurrentAccount("Conta 3", 123333, 3003);
        CurrentAccount account4 = new CurrentAccount("Conta 4", 123334, 1500);

        ArrayList<CurrentAccount> accountArrayList = new ArrayList<>();
        accountArrayList.add(account);
        accountArrayList.add(account1);
        accountArrayList.add(account2);
        accountArrayList.add(account3);
        accountArrayList.add(account4);

        CurrentAccount biggestBalance = accountArrayList.getFirst();
        for (CurrentAccount currentAccount : accountArrayList){
            if (currentAccount.getBalance() > biggestBalance.getBalance()){
                biggestBalance = currentAccount;
            }
        }
        System.out.println("Conta com maior saldo - Número "+ biggestBalance.getNumberAccount() +", Saldo: $ "+ biggestBalance.getBalance());
        System.out.println("*** [END] ***\n");


        // Numbers
        System.out.println("\n*** [Numbers] ***");
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(7);
        System.out.println("*** [END] ***\n");

        // Converter
        System.out.println("\n*** [CONVERTER] ***");
        ConversorMoeda conversorMoeda = new ConversorMoeda();
        conversorMoeda.converterDolarReal(50);

        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.calcularArea(5, 8);
        calculadora.calcularPerimetro(5, 8);

        ConversorTemperatura conversorTemperatura = new ConversorTemperaturaPadrao();
        conversorTemperatura.celsiusParaFahrenheit(25);
        conversorTemperatura.fahrenheitParaCelsius(77);
        System.out.println("*** [END] ***\n");

        // Shapes
        System.out.println("\n*** [SHAPE] ***");
        Square square1 = new Square(3.5);
        Square square2 = new Square(5);

        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2.5);

        ArrayList<Shape> shapeArrayList = new ArrayList<>();
        shapeArrayList.add(square1);
        shapeArrayList.add(square2);
        shapeArrayList.add(circle1);
        shapeArrayList.add(circle2);

        for (Shape shape : shapeArrayList){
            System.out.println("Área calculada: "+ shape.calculateArea());
        }

        System.out.println("*** [END] ***\n");


        // Arrays
        System.out.println("\n*** [Arrays] ***");

        ArrayList<Integer> numberList =  new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(new Random().nextInt(100));
        }
        System.out.println("Before:\t"+ numberList);
        Collections.sort(numberList);
        System.out.println("After:\t"+ numberList);

        System.out.println();

        ArrayList<Title> titleArrayList = new ArrayList<>();
        titleArrayList.add(new Title("Aleluia"));
        titleArrayList.add(new Title("Paz"));
        titleArrayList.add(new Title("Igreja"));
        titleArrayList.add(new Title("Missa"));
        System.out.println("Before:\t"+ titleArrayList);
        Collections.sort(titleArrayList);
        System.out.println("After:\t"+ titleArrayList);

        System.out.println();

        List<Integer> numberList1 =  new ArrayList<>();
        List<Integer> numberList2 =  new LinkedList<>();

        int numberAux;
        for (int i = 0; i < 5; i++) {
            numberAux = new Random().nextInt(100);
            numberList1.add(numberAux);
            numberList2.add(numberAux);
        }
        System.out.println("List:\t"+ numberList1.getClass());
        System.out.println("Before:\t"+ numberList1);
        Collections.sort(numberList1);
        System.out.println("After:\t"+ numberList1);

        System.out.println("List:\t"+ numberList2.getClass());
        System.out.println("Before:\t"+ numberList2);
        Collections.sort(numberList2);
        System.out.println("After:\t"+ numberList2);

        System.out.println();

        List<String> stringListPoli;
        stringListPoli = new ArrayList<>();
        stringListPoli.add("Element 1");
        stringListPoli.add("Element 2");
        System.out.println("Polyform list:\t"+ stringListPoli.getClass());
        System.out.println(stringListPoli);

        stringListPoli = new LinkedList<>();
        stringListPoli.add("Element A");
        stringListPoli.add("Element B");
        System.out.println("polyform list:\t"+ stringListPoli.getClass());
        System.out.println(stringListPoli);

        System.out.println("*** [END] ***\n");

    }
}
