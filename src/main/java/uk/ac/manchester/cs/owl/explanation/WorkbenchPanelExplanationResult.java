package uk.ac.manchester.cs.owl.explanation;

import org.protege.editor.owl.ui.explanation.ExplanationResult;

import javax.swing.*;
import java.awt.*;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 18/03/2012
 */
public class WorkbenchPanelExplanationResult extends ExplanationResult {

    private WorkbenchPanel workbenchPanel;

    public WorkbenchPanelExplanationResult(WorkbenchPanel workbenchPanel) {
        this.workbenchPanel = workbenchPanel;
        setLayout(new BorderLayout());
        add(workbenchPanel);
    }

    @Override
    public void dispose() {
        workbenchPanel.dispose();
    }
}
