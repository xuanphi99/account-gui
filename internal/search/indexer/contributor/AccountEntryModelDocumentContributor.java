package com.dogoo.poc.account.internal.search.indexer.contributor;

import com.dogoo.poc.account.constant.SearchField;
import com.dogoo.poc.account.model.AccountEntry;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;
import org.osgi.service.component.annotations.Component;

@Component(
        immediate = true,
        property = "indexer.class.name=com.dogoo.poc.account.model.AccountEntry",
        service = ModelDocumentContributor.class
)
public class AccountEntryModelDocumentContributor implements ModelDocumentContributor<AccountEntry> {
    @Override
    public void contribute(Document document, AccountEntry baseModel) {
        document.addText(SearchField.FULL_NAME, baseModel.getFullName());
        document.addKeywordSortable(SearchField.FULL_NAME, baseModel.getFullName());

        document.addText(SearchField.EMAIL, baseModel.getEmail());
        document.addKeywordSortable(SearchField.EMAIL, baseModel.getEmail());

    }
}
