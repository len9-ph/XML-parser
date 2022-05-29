public class Parser {
    private static Processor processor;
    private static void validate(String[] args) {
        if (args.length == 1)
            processor = new Processor(args[0]);
        else if (args.length == 2) {
            if (!(args[1].equals("name") || args[1].equals("age")))
                throw new IllegalArgumentException("Неверно указан пареметр сортировки");
            processor = new Processor(args[0], args[1]);
        }
        else throw new IllegalArgumentException("Неверный ввод");
    }

    public static void main(String[] args){
        try {
            validate(args);
            processor.run();
            PatientOutput patientOutput = new PatientOutput();
            patientOutput.output(processor.getPatients());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
