public class TeamLeadJavaDeveloper extends DeveloperDecorator{

    public TeamLeadJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeProgram(){
        return "Send week report. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeProgram();
    }
}
