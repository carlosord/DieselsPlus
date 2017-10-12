package dslfiles.wizards.business;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (model).
 */

public class NewBusinessDslFilePage extends WizardNewFileCreationPage {

    /**
     * Constructor for Business DSL wizard Page.
     *
     * @param selection
     *            folder which is selected
     */
    public NewBusinessDslFilePage(IStructuredSelection selection) {
        super("NewBusinessDslFilePage", selection);
        setTitle("New Business DSL file");
        setDescription(
                "Create a new file with *.business extension to Diesels Tool.");
        setFileExtension("business");
        setFileName("business_dsl");
    }

    @Override
    protected InputStream getInitialContents() {
        StringBuilder contents = new StringBuilder();
        contents.append("/*\n");
        contents.append(
                " * Business DSL File. This DSL contains business services specification\n");
        contents.append(" */");

        return new ByteArrayInputStream(contents.toString().getBytes());
    }

}