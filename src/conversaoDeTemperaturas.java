import java.util.Scanner;

public class conversaoDeTemperaturas {

    private static final double FATOR1 = (9d / 5.0);
    private static final double FATOR2 = 32.0;

    // valor do fator 3 peguei na conversão do google
    private static final double FATOR3 = 273.15;

    private static final double FATOR4 = (5d / 9.0);


    private static double celsiusParaFahrenheit(double celsius) {
        return ((celsius * FATOR1) + FATOR2);
    }

    private static double fahrenheitParaCelsius(double fahrenheit) {
        return ((fahrenheit - FATOR2) / FATOR1);
    }

    private static double celsiusParaKelvin(double celsius) {
        return (celsius + FATOR3);
    }

    private static double kelvinParaCelsius(double kelvin) {
        return (kelvin - FATOR3);
    }

    private static double kelvinParaFahrenheit(double kelvin) {
        return ((FATOR1 * (kelvin - FATOR3)) + FATOR2);
    }

    private static double fahrenheitParaKelvin(double fahrenheit) {
        return ((fahrenheit - FATOR2) * FATOR4 + FATOR3);
    }

    private static double celsiusParaCelsius(double celsius) {
        return celsius;
    }

    private static double fahrenheitParaFahrenheit(double fahrenheit) {
        return fahrenheit;
    }

    private static double kelvinParaKelvin(double kelvin) {
        return kelvin;
    }



    public static double somatorioDasTemperaturas(double[] temperaturas) {
        double soma = 0;
        for (int i = 0; i < temperaturas.length; i++) {
            soma += temperaturas[i];
        }
        return soma;
    }


    public static void main(String[] args) {
        Scanner conversao = new Scanner(System.in);
        System.out.println("Digite a conversão que você quer fazer: \n 1 - Celsius Para Kelvin;\n 2 - Celsius para Fahrenheit;\n 3 - Fahrenheit para Celsius;\n 4 - Fahrenheit para Kelvin;\n 5 - Kelvin para Celsius;\n 6 - Kelvin para Fahrenheit;\n 7 - Celsius para Celsius;\n 8 -Fahrenheit para Fahrenheit\n 9 - Kelvin para Kelvin;");
        System.out.print("Digite o número da conversão desejada: ");
        int opcao = conversao.nextInt();
        int quantidade;
        double[] temperaturas;
        System.out.print("Digite a quantidade de temperaturas: ");
        quantidade = conversao.nextInt();
        temperaturas = new double[quantidade];
        double converteTemperatura = 0;
        double[] temperaturasNovas;
        temperaturasNovas = new double[quantidade];
        double mediaAntiga;
        double mediaNova;
        double media;
        try {
            switch (opcao) {
                case 1 -> {
                    for (int i = 0; i < quantidade; i++) {
                        System.out.print("Digite a temperatura " + (i + 1) + " : ");
                        temperaturas[i] = conversao.nextDouble();
                        converteTemperatura = celsiusParaKelvin(temperaturas[i]);
                        temperaturasNovas[i] = converteTemperatura;
                        System.out.println("A temperatura de " + temperaturas[i] + "°C transformada para Kelvin é : " + converteTemperatura + "K");
                    }
                    mediaAntiga = somatorioDasTemperaturas(temperaturas) / quantidade;
                    mediaNova = somatorioDasTemperaturas(temperaturasNovas) / quantidade;
                    System.out.println("A média das temperaturas em Celsius é: " + mediaAntiga);
                    System.out.println("A média das temperaturas em Kelvin é: " + mediaNova);
                }
                case 2 -> {
                    for (int i = 0; i < quantidade; i++) {
                        System.out.print("Digite a temperatura " + (i + 1) + " : ");
                        ;
                        temperaturas[i] = conversao.nextDouble();
                        converteTemperatura = celsiusParaFahrenheit(temperaturas[i]);
                        temperaturasNovas[i] = converteTemperatura;
                        System.out.println("A temperatura de " + temperaturas[i] + "°C transformada para Fahrenheit é : " + converteTemperatura + "°F");
                    }
                    mediaAntiga = somatorioDasTemperaturas(temperaturas) / quantidade;
                    mediaNova = somatorioDasTemperaturas(temperaturasNovas) / quantidade;
                    System.out.println("A média das temperaturas em Celsius é: " + mediaAntiga);
                    System.out.println("A média das temperaturas em Fahrenheit é: " + mediaNova);
                }
                case 3 -> {
                    for (int i = 0; i < quantidade; i++) {
                        System.out.print("Digite a temperatura " + (i + 1) + " : ");
                        temperaturas[i] = conversao.nextDouble();
                        converteTemperatura = fahrenheitParaCelsius(temperaturas[i]);
                        temperaturasNovas[i] = converteTemperatura;
                        System.out.println("A temperatura de " + temperaturas[i] + "°F transformada para Celsius é : " + converteTemperatura + "°C");
                    }
                    mediaAntiga = somatorioDasTemperaturas(temperaturas) / quantidade;
                    mediaNova = somatorioDasTemperaturas(temperaturasNovas) / quantidade;
                    System.out.println("A média das temperaturas em Fahrenheit é: " + mediaAntiga);
                    System.out.println("A média das temperaturas em Celsius é: " + mediaNova);
                }
                case 4 -> {
                    for (int i = 0; i < quantidade; i++) {
                        System.out.print("Digite a temperatura " + (i + 1) + " : ");
                        temperaturas[i] = conversao.nextDouble();
                        converteTemperatura = fahrenheitParaKelvin(temperaturas[i]);
                        temperaturasNovas[i] = converteTemperatura;
                        System.out.println("A temperatura de " + temperaturas[i] + "°F transformada para kelvin é : " + converteTemperatura + "K");
                    }
                    mediaAntiga = somatorioDasTemperaturas(temperaturas) / quantidade;
                    mediaNova = somatorioDasTemperaturas(temperaturasNovas) / quantidade;
                    System.out.println("A média das temperaturas em Fahrenheit é: " + mediaAntiga);
                    System.out.println("A média das temperaturas em Kelvin é: " + mediaNova);
                }
                case 5 -> {
                    for (int i = 0; i < quantidade; i++) {
                        System.out.print("Digite a temperatura " + (i + 1) + " : ");
                        temperaturas[i] = conversao.nextDouble();
                        converteTemperatura = kelvinParaCelsius(temperaturas[i]);
                        temperaturasNovas[i] = converteTemperatura;
                        System.out.println("A temperatura de " + temperaturas[i] + "K transformada para Celsius é : " + converteTemperatura + "°C");
                    }
                    mediaAntiga = somatorioDasTemperaturas(temperaturas) / quantidade;
                    mediaNova = somatorioDasTemperaturas(temperaturasNovas) / quantidade;
                    System.out.println("A média das temperaturas em Kelvin é: " + mediaAntiga);
                    System.out.println("A média das temperaturas em Celsius é: " + mediaNova);
                }
                case 6 -> {
                    for (int i = 0; i < quantidade; i++) {

                        System.out.print("Digite a temperatura " + (i + 1) + " : ");
                        temperaturas[i] = conversao.nextDouble();
                        converteTemperatura = kelvinParaFahrenheit(temperaturas[i]);
                        temperaturasNovas[i] = converteTemperatura;
                        System.out.println("A temperatura de " + temperaturas[i] + "K transformada para Fahrenheit é : " + converteTemperatura + "°F");
                    }
                    mediaAntiga = somatorioDasTemperaturas(temperaturas) / quantidade;
                    mediaNova = somatorioDasTemperaturas(temperaturasNovas) / quantidade;
                    System.out.println("A média das temperaturas em Kelvin é: " + mediaAntiga);
                    System.out.println("A média das temperaturas em Fahrenheit é: " + mediaNova);

                }
                case 7 -> {
                    for (int i = 0; i < quantidade; i++) {

                        System.out.print("Digite a temperatura " + (i + 1) + " : ");
                        temperaturas[i] = conversao.nextDouble();
                        converteTemperatura = celsiusParaCelsius(temperaturas[i]);
                        temperaturasNovas[i] = converteTemperatura;
                        System.out.println("Como a conversão da temperatura é para mesma unidade sua é temperatura " + temperaturas[i] + "°C");
                    }
                    media = somatorioDasTemperaturas(temperaturas) / quantidade;
                    mediaNova = somatorioDasTemperaturas(temperaturasNovas) / quantidade;
                    System.out.println("A média das temperaturas é: " + media);

                }
                case 8 -> {
                    for (int i = 0; i < quantidade; i++) {

                        System.out.print("Digite a temperatura " + (i + 1) + " : ");
                        temperaturas[i] = conversao.nextDouble();
                        converteTemperatura = fahrenheitParaFahrenheit(temperaturas[i]);
                        temperaturasNovas[i] = converteTemperatura;
                        System.out.println("Como a conversão da temperatura é para mesma unidade sua é temperatura " + temperaturas[i] + "°F");
                    }
                    media = somatorioDasTemperaturas(temperaturas) / quantidade;
                    System.out.println("A média das temperaturas é: " + media);

                }
                case 9 -> {
                    for (int i = 0; i < quantidade; i++) {

                        System.out.print("Digite a temperatura " + (i + 1) + " : ");
                        temperaturas[i] = conversao.nextDouble();
                        converteTemperatura = kelvinParaKelvin(temperaturas[i]);
                        temperaturasNovas[i] = converteTemperatura;
                        System.out.println("Como a conversão da temperatura é para mesma unidade sua é temperatura " + temperaturas[i] + "K");
                    }
                    media = somatorioDasTemperaturas(temperaturas) / quantidade;
                    System.out.println("A média das temperaturas é: " + media);

                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }catch (Exception e){
            System.out.println("Eita, aconteceu algum erro! Tente novamente!");
        }
        finally {
            System.out.println("Finalizando o programa!");
        }


    }


}

