package ButtonSizeApp;

public class Canvas {

    public static void main(String[] args) {

        CheckBoxButton checkBoxButton = new CheckBoxButton(new SmallButtonSize());
        checkBoxButton.draw();

        RadioButton radioButton = new RadioButton(new MediumButtonSize());
        checkBoxButton.draw();

        DropDownButton dropdownButton = new DropDownButton(new LargeButtonSize());
        checkBoxButton.draw();
    }
}

