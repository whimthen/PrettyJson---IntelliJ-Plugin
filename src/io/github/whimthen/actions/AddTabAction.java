package io.github.whimthen.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import io.github.whimthen.service.JsonService;
import org.jetbrains.annotations.NotNull;

public class AddTabAction extends AnAction {

    public static final String ID = "JsonFormatter.AddTabAction";

    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        JsonService.getInstance().createTab(event.getProject());
    }

}
