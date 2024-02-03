package toothless.commands;

import toothless.Storage;
import toothless.TaskList;
import toothless.ToothlessException;
import toothless.Ui;

/**
 * Represents a command to list all tasks currently in the task list.
 * When executed, this command iterates through the task list and displays each task to the user.
 */
public class ListCommand extends Command{

    /**
     * Executes the command to list all tasks in the task list. If the list is empty, it throws an exception
     * to inform the user that there are no tasks to display.
     *
     * @param ui The user interface to interact with.
     * @param taskList The task list whose tasks are to be displayed.
     * @param storage The storage system, not directly used by this command.
     * @return false to indicate the application should continue running.
     * @throws ToothlessException If the task list is empty.
     */
    @Override
    public boolean handle(Ui ui, TaskList taskList, Storage storage) throws ToothlessException {
        if (taskList.size() == 0){
            throw new ToothlessException("Human list is empty like my tummy right now :/");
        }
        System.out.println("Here are the tasks in your list:");
        for (int i = 0; i < taskList.size(); i++) {
            ui.showTask(taskList.getTask(i), i);
        }
        return false;
    }
}
