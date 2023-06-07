package ButtonSizeApp;

public class DropDownButton extends Button{

    ButtonSize buttonSize;

    public DropDownButton (ButtonSize buttonSize){
        this.buttonSize = buttonSize;
    }

    public void draw(){
        buttonSize.getSize();
        System.out.println("Drawing a Dropdown button.\n");
    }


}
