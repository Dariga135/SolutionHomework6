import java.util.HashMap;
import java.util.Map;

class SmartHomeRemoteControl {
    private Map<String, Command> slots = new HashMap<>();
    private Command lastCommand = null;

    public void setCommand(String slot, Command command) {
        slots.put(slot, command);
    }

    public void pressButton(String slot) {
        Command command = slots.get(slot);
        if (command != null) {
            command.execute();
            lastCommand = command;
        }
    }

    public void undoButton() {
        if (lastCommand != null) {
            lastCommand.undo();
        }
    }
}