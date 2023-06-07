package ButtonSizeApp;

public class CheckBoxButton extends Button{

    ButtonSize buttonSize;

    public CheckBoxButton (ButtonSize buttonSize){
        this.buttonSize = buttonSize;
    }

    public void draw(){
        buttonSize.getSize();
        System.out.println("Drawing a CheckBox button.\n");
    }

}
