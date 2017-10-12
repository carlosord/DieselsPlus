package dslfiles.wizards.persistence;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (persistence).
 */

public class NewPersistenceDslFilePage extends WizardNewFileCreationPage {

    /**
     * Constructor for Persistence DSL wizard Page.
     *
     * @param selection
     *            folder which is selected
     */
    public NewPersistenceDslFilePage(IStructuredSelection selection) {
        super("NewPersistenceDslFilePage", selection);
        setTitle("New Persistence DSL file");
        setDescription(
                "Create a new file with *.persistence extension to Diesels Tool.");
        setFileExtension("persistence");
        setFileName("persistence_dsl");
    }

    @Override
    protected InputStream getInitialContents() {
        StringBuilder contents = new StringBuilder();
        contents.append("/*\n");
        contents.append(
                " * Persistence DSL File. This DSL contains domail persistence elements specification\n");
        contents.append(" */");

        return new ByteArrayInputStream(contents.toString().getBytes());
    }

}