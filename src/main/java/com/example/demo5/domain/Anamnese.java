package com.example.demo5.domain;

import org.hibernate.internal.util.StringHelper;

import javax.persistence.*;

@Entity
public class Anamnese {
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY )
    private Long id;
    private boolean diabetesResp;
    private String diabetesObs;
    private boolean hipertensaoResp;
    private String hipertensaoObs;
    private boolean problemaRespiratorioResp;
    private boolean anemiaResp;
    private String anemiaObs;
    private boolean problemaOcularResp;
    private boolean acimaPesoResp;
    private String acimaPesoObs;
    private boolean problemaRenalResp;
    private String problemaRenalObs;
    private boolean parenteDiabetesResp;
    private String parenteDiabetesObs;
    private boolean parenteHipertensaoResp;
    private String parenteHipertensaoObs;
    private boolean parenteCardiacoResp;
    private String parenteCardiacoObs;
    private boolean parenteRespiratorioResp;
    private String parenteRespiratorioObs;
    private boolean parenteProblemaRenalResp;
    private String parenteProblemaRenalObs;
    private boolean parenteCancerResp;
    private String parenteCancerObs;
    private boolean internadoResp;
    private String internadoObs;
    private boolean procedimentoCirurgicoResp;
    private String procedimentoCirurgicoObs;
    private boolean usoAlcoolResp;
    private String usoAlcoolObs;
    private boolean fumaResp;
    private String fumaObs;
    private boolean conviveFumaResp;
    private boolean usoMedicamentoResp;
    private String usoMedicamentoObs;
    private boolean estresseResp;
    private String estresseObs;
    private boolean ansiedadeResp;
    private String ansiedadeObs;
    private String horasSentado;
    private String passaMaiorParteDoTempo;
    private String praticaAtividadeFisicaResp;
    private String praticaAtividadeFisicaObs;
    private String possuiDieta;
    private String exposisaoSol;
    private boolean tosseResp;
    private String tosseObs;
    private boolean tonturaResp;
    private boolean dorResp;
    private String dorObs;
    private boolean franquezaResp;
    private boolean faltaDeArResp;
    private boolean batimentoCardiacoResp;
    private String batimentoCardiacoObs;
    private boolean febreResp;
    private String febreObs;
    private boolean inchacoResp;
    private String inchacoObs;
    private boolean tremorResp;
    private String informacoesRelevantes;

    @ManyToOne
    private Paciente paciente;

    //sets e gets
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isDiabetesResp() {
        return diabetesResp;
    }

    public void setDiabetesResp(boolean diabetesResp) {
        this.diabetesResp = diabetesResp;
    }

    public String getDiabetesObs() {
        return diabetesObs;
    }

    public void setDiabetesObs(String diabetesObs) {
        this.diabetesObs = diabetesObs;
    }

    public boolean isHipertensaoResp() {
        return hipertensaoResp;
    }

    public void setHipertensaoResp(boolean hipertensaoResp) {
        this.hipertensaoResp = hipertensaoResp;
    }

    public String getHipertensaoObs() {
        return hipertensaoObs;
    }

    public void setHipertensaoObs(String hipertensaoObs) {
        this.hipertensaoObs = hipertensaoObs;
    }

    public boolean isProblemaRespiratorioResp() {
        return problemaRespiratorioResp;
    }

    public void setProblemaRespiratorioResp(boolean problemaRespiratorioResp) {
        this.problemaRespiratorioResp = problemaRespiratorioResp;
    }

    public boolean isAnemiaResp() {
        return anemiaResp;
    }

    public void setAnemiaResp(boolean anemiaResp) {
        this.anemiaResp = anemiaResp;
    }

    public String getAnemiaObs() {
        return anemiaObs;
    }

    public void setAnemiaObs(String anemiaObs) {
        this.anemiaObs = anemiaObs;
    }

    public boolean isProblemaOcularResp() {
        return problemaOcularResp;
    }

    public void setProblemaOcularResp(boolean problemaOcularResp) {
        this.problemaOcularResp = problemaOcularResp;
    }

    public boolean isAcimaPesoResp() {
        return acimaPesoResp;
    }

    public void setAcimaPesoResp(boolean acimaPesoResp) {
        this.acimaPesoResp = acimaPesoResp;
    }

    public String getAcimaPesoObs() {
        return acimaPesoObs;
    }

    public void setAcimaPesoObs(String acimaPesoObs) {
        this.acimaPesoObs = acimaPesoObs;
    }

    public boolean isProblemaRenalResp() {
        return problemaRenalResp;
    }

    public void setProblemaRenalResp(boolean problemaRenalResp) {
        this.problemaRenalResp = problemaRenalResp;
    }

    public String getProblemaRenalObs() {
        return problemaRenalObs;
    }

    public void setProblemaRenalObs(String problemaRenalObs) {
        this.problemaRenalObs = problemaRenalObs;
    }

    public boolean isParenteDiabetesResp() {
        return parenteDiabetesResp;
    }

    public void setParenteDiabetesResp(boolean parenteDiabetesResp) {
        this.parenteDiabetesResp = parenteDiabetesResp;
    }

    public String getParenteDiabetesObs() {
        return parenteDiabetesObs;
    }

    public void setParenteDiabetesObs(String parenteDiabetesObs) {
        this.parenteDiabetesObs = parenteDiabetesObs;
    }

    public boolean isParenteHipertensaoResp() {
        return parenteHipertensaoResp;
    }

    public void setParenteHipertensaoResp(boolean parenteHipertensaoResp) {
        this.parenteHipertensaoResp = parenteHipertensaoResp;
    }

    public String getParenteHipertensaoObs() {
        return parenteHipertensaoObs;
    }

    public void setParenteHipertensaoObs(String parenteHipertensaoObs) {
        this.parenteHipertensaoObs = parenteHipertensaoObs;
    }

    public boolean isParenteCardiacoResp() {
        return parenteCardiacoResp;
    }

    public void setParenteCardiacoResp(boolean parenteCardiacoResp) {
        this.parenteCardiacoResp = parenteCardiacoResp;
    }

    public String getParenteCardiacoObs() {
        return parenteCardiacoObs;
    }

    public void setParenteCardiacoObs(String parenteCardiacoObs) {
        this.parenteCardiacoObs = parenteCardiacoObs;
    }

    public boolean isParenteRespiratorioResp() {
        return parenteRespiratorioResp;
    }

    public void setParenteRespiratorioResp(boolean parenteRespiratorioResp) {
        this.parenteRespiratorioResp = parenteRespiratorioResp;
    }

    public String getParenteRespiratorioObs() {
        return parenteRespiratorioObs;
    }

    public void setParenteRespiratorioObs(String parenteRespiratorioObs) {
        this.parenteRespiratorioObs = parenteRespiratorioObs;
    }

    public boolean isParenteProblemaRenalResp() {
        return parenteProblemaRenalResp;
    }

    public void setParenteProblemaRenalResp(boolean parenteProblemaRenalResp) {
        this.parenteProblemaRenalResp = parenteProblemaRenalResp;
    }

    public String getParenteProblemaRenalObs() {
        return parenteProblemaRenalObs;
    }

    public void setParenteProblemaRenalObs(String parenteProblemaRenalObs) {
        this.parenteProblemaRenalObs = parenteProblemaRenalObs;
    }

    public boolean isParenteCancerResp() {
        return parenteCancerResp;
    }

    public void setParenteCancerResp(boolean parenteCancerResp) {
        this.parenteCancerResp = parenteCancerResp;
    }

    public String getParenteCancerObs() {
        return parenteCancerObs;
    }

    public void setParenteCancerObs(String parenteCancerObs) {
        this.parenteCancerObs = parenteCancerObs;
    }

    public boolean isInternadoResp() {
        return internadoResp;
    }

    public void setInternadoResp(boolean internadoResp) {
        this.internadoResp = internadoResp;
    }

    public String getInternadoObs() {
        return internadoObs;
    }

    public void setInternadoObs(String internadoObs) {
        this.internadoObs = internadoObs;
    }

    public boolean isProcedimentoCirurgicoResp() {
        return procedimentoCirurgicoResp;
    }

    public void setProcedimentoCirurgicoResp(boolean procedimentoCirurgicoResp) {
        this.procedimentoCirurgicoResp = procedimentoCirurgicoResp;
    }

    public String getProcedimentoCirurgicoObs() {
        return procedimentoCirurgicoObs;
    }

    public void setProcedimentoCirurgicoObs(String procedimentoCirurgicoObs) {
        this.procedimentoCirurgicoObs = procedimentoCirurgicoObs;
    }

    public boolean isUsoAlcoolResp() {
        return usoAlcoolResp;
    }

    public void setUsoAlcoolResp(boolean usoAlcoolResp) {
        this.usoAlcoolResp = usoAlcoolResp;
    }

    public String getUsoAlcoolObs() {
        return usoAlcoolObs;
    }

    public void setUsoAlcoolObs(String usoAlcoolObs) {
        this.usoAlcoolObs = usoAlcoolObs;
    }

    public boolean isFumaResp() {
        return fumaResp;
    }

    public void setFumaResp(boolean fumaResp) {
        this.fumaResp = fumaResp;
    }

    public String getFumaObs() {
        return fumaObs;
    }

    public void setFumaObs(String fumaObs) {
        this.fumaObs = fumaObs;
    }

    public boolean isConviveFumaResp() {
        return conviveFumaResp;
    }

    public void setConviveFumaResp(boolean conviveFumaResp) {
        this.conviveFumaResp = conviveFumaResp;
    }

    public boolean isUsoMedicamentoResp() {
        return usoMedicamentoResp;
    }

    public void setUsoMedicamentoResp(boolean usoMedicamentoResp) {
        this.usoMedicamentoResp = usoMedicamentoResp;
    }

    public String getUsoMedicamentoObs() {
        return usoMedicamentoObs;
    }

    public void setUsoMedicamentoObs(String usoMedicamentoObs) {
        this.usoMedicamentoObs = usoMedicamentoObs;
    }

    public boolean isEstresseResp() {
        return estresseResp;
    }

    public void setEstresseResp(boolean estresseResp) {
        this.estresseResp = estresseResp;
    }

    public String getEstresseObs() {
        return estresseObs;
    }

    public void setEstresseObs(String estresseObs) {
        this.estresseObs = estresseObs;
    }

    public boolean isAnsiedadeResp() {
        return ansiedadeResp;
    }

    public void setAnsiedadeResp(boolean ansiedadeResp) {
        this.ansiedadeResp = ansiedadeResp;
    }

    public String getAnsiedadeObs() {
        return ansiedadeObs;
    }

    public void setAnsiedadeObs(String ansiedadeObs) {
        this.ansiedadeObs = ansiedadeObs;
    }

    public String getHorasSentado() {
        return horasSentado;
    }

    public void setHorasSentado(String horasSentado) {
        this.horasSentado = horasSentado;
    }

    public String getPassaMaiorParteDoTempo() {
        return passaMaiorParteDoTempo;
    }

    public void setPassaMaiorParteDoTempo(String passaMaiorParteDoTempo) {
        this.passaMaiorParteDoTempo = passaMaiorParteDoTempo;
    }

    public String getPraticaAtividadeFisicaResp() {
        return praticaAtividadeFisicaResp;
    }

    public void setPraticaAtividadeFisicaResp(String praticaAtividadeFisicaResp) {
        this.praticaAtividadeFisicaResp = praticaAtividadeFisicaResp;
    }

    public String getPraticaAtividadeFisicaObs() {
        return praticaAtividadeFisicaObs;
    }

    public void setPraticaAtividadeFisicaObs(String praticaAtividadeFisicaObs) {
        this.praticaAtividadeFisicaObs = praticaAtividadeFisicaObs;
    }

    public String getPossuiDieta() {
        return possuiDieta;
    }

    public void setPossuiDieta(String possuiDieta) {
        this.possuiDieta = possuiDieta;
    }

    public String getExposisaoSol() {
        return exposisaoSol;
    }

    public void setExposisaoSol(String exposisaoSol) {
        this.exposisaoSol = exposisaoSol;
    }

    public boolean isTosseResp() {
        return tosseResp;
    }

    public void setTosseResp(boolean tosseResp) {
        this.tosseResp = tosseResp;
    }

    public String getTosseObs() {
        return tosseObs;
    }

    public void setTosseObs(String tosseObs) {
        this.tosseObs = tosseObs;
    }

    public boolean isTonturaResp() {
        return tonturaResp;
    }

    public void setTonturaResp(boolean tonturaResp) {
        this.tonturaResp = tonturaResp;
    }

    public boolean isDorResp() {
        return dorResp;
    }

    public void setDorResp(boolean dorResp) {
        this.dorResp = dorResp;
    }

    public String getDorObs() {
        return dorObs;
    }

    public void setDorObs(String dorObs) {
        this.dorObs = dorObs;
    }

    public boolean isFranquezaResp() {
        return franquezaResp;
    }

    public void setFranquezaResp(boolean franquezaResp) {
        this.franquezaResp = franquezaResp;
    }

    public boolean isFaltaDeArResp() {
        return faltaDeArResp;
    }

    public void setFaltaDeArResp(boolean faltaDeArResp) {
        this.faltaDeArResp = faltaDeArResp;
    }

    public boolean isBatimentoCardiacoResp() {
        return batimentoCardiacoResp;
    }

    public void setBatimentoCardiacoResp(boolean batimentoCardiacoResp) {
        this.batimentoCardiacoResp = batimentoCardiacoResp;
    }

    public String getBatimentoCardiacoObs() {
        return batimentoCardiacoObs;
    }

    public void setBatimentoCardiacoObs(String batimentoCardiacoObs) {
        this.batimentoCardiacoObs = batimentoCardiacoObs;
    }

    public boolean isFebreResp() {
        return febreResp;
    }

    public void setFebreResp(boolean febreResp) {
        this.febreResp = febreResp;
    }

    public String getFebreObs() {
        return febreObs;
    }

    public void setFebreObs(String febreObs) {
        this.febreObs = febreObs;
    }

    public boolean isInchacoResp() {
        return inchacoResp;
    }

    public void setInchacoResp(boolean inchacoResp) {
        this.inchacoResp = inchacoResp;
    }

    public String getInchacoObs() {
        return inchacoObs;
    }

    public void setInchacoObs(String inchacoObs) {
        this.inchacoObs = inchacoObs;
    }

    public boolean isTremorResp() {
        return tremorResp;
    }

    public void setTremorResp(boolean tremorResp) {
        this.tremorResp = tremorResp;
    }

    public String getInformacoesRelevantes() {
        return informacoesRelevantes;
    }

    public void setInformacoesRelevantes(String informacoesRelevantes) {
        this.informacoesRelevantes = informacoesRelevantes;
    }


}

