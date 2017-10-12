package dslfiles.wizards.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (model).
 */

public class NewModelDslFilePage extends WizardNewFileCreationPage {

    /**
     * Constructor for Model DSL wizard Page.
     *
     * @param selection
     *            folder which is selected
     */
    public NewModelDslFilePage(IStructuredSelection selection) {
        super("NewModelDslFilePage", selection);
        setTitle("New Model DSL file");
        setDescription(
                "Create a new file with *.model extension to Diesels Tool.");
        setFileExtension("model");
        setFileName("model_dsl");
    }

    @Override
    protected InputStream getInitialContents() {
        StringBuilder contents = new StringBuilder();
        contents.append("/*\n");
        contents.append(
                " * Model DSL File. This DSL contains domail model elements specification\n");
        contents.append(" */");

        return new ByteArrayInputStream(contents.toString().getBytes());
    }

}