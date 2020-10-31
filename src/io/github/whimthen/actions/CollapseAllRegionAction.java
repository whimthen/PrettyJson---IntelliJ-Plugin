package io.github.whimthen.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import io.github.whimthen.kits.JsonAction;
import org.jetbrains.annotations.NotNull;

public class CollapseAllRegionAction extends AnAction implements CEInvokeAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        this.invoke(JsonAction.InternalID.COLLAPSE_ALL_REGIONS, e);
    }

}
