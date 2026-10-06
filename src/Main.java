void main (){

    Sms sms = new Sms("Davi", 12343);
    IO.println(sms);
    sms.enviar("ooi");


    Email email = new Email("Stacy", "Stacy", "Davi");
    IO.println(email);
    email.enviar("bayy");
}