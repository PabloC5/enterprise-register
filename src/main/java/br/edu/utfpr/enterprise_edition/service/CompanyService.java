package br.edu.utfpr.enterprise_edition.service;

import br.edu.utfpr.enterprise_edition.model.dao.CompanyDao;
import br.edu.utfpr.enterprise_edition.model.domain.Company;

public class CompanyService extends AbstractService <Long, Company>{

    public CompanyService() {
        dao = new CompanyDao();
    }
}
