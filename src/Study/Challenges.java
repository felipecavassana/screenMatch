package Study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        for (Product product : productArrayList){
            System.out.println(product);
        }

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

        Cat cat = new Cat();
        cat.arranharMoveis();
        cat.makeSound();
        System.out.println("*** [END] ***\n");


        // BankAccount
        System.out.println("\n*** [BANK ACCOUNT] ***");
        CurrentAccount account = new CurrentAccount();
        account.setBalance(1000);
        account.consultarSaldo();

        account.depositar(200);
        account.consultarSaldo();
        account.setTarifaMensal(15.50);
        account.cobrarTarifaMensal();

        account.sacar(120);
        account.consultarSaldo();
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
    }
}
