public class SeniorJavaDeveloper extends DeveloperDecorator{

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCode(){
        return "Make code. ";
    }

    @Override
    public String makeJob() {
        return super .makeJob() + makeCode();
    }
}
