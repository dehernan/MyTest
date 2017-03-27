package ar.edu.untref.aydoo;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static ar.edu.untref.aydoo.Province.*;

/**
 * Created by hernan on 24/03/17.
 */
public class IntegracionTest {


    PresidentialPrimaryElection presidentialElection;

    @Test
    public void nationallyMostVotedCandidateTest(){

        presidentialElection = new PresidentialPrimaryElection();

        presidentialElection.newPoliticalParty("Derecha");
        presidentialElection.newPoliticalParty("Izquierda");
        presidentialElection.newCandidate("Lucas", presidentialElection.getPoliticalParty("Derecha"));
        presidentialElection.newCandidate("Matias", presidentialElection.getPoliticalParty("Derecha"));
        presidentialElection.newCandidate("Horacio", presidentialElection.getPoliticalParty("Izquierda"));
        presidentialElection.newCandidate("Sandra", presidentialElection.getPoliticalParty("Izquierda"));

        presidentialElection.newVote(SAN_LUIS, presidentialElection.getCandidate("Lucas"));
        presidentialElection.newVote(CATAMARCA, presidentialElection.getCandidate("Lucas"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(MENDOZA, presidentialElection.getCandidate("Horacio"));
        presidentialElection.newVote(SAN_LUIS, presidentialElection.getCandidate("Lucas"));

        Assert.assertEquals("Lucas", presidentialElection.nationallyMostVotedCandidate(presidentialElection.candidates));

    }

    @Test
    public void nationallyMostVotedCandidateTest2(){

        presidentialElection = new PresidentialPrimaryElection();

        presidentialElection.newPoliticalParty("Derecha");
        presidentialElection.newPoliticalParty("Izquierda");
        presidentialElection.newCandidate("Lucas", presidentialElection.getPoliticalParty("Derecha"));
        presidentialElection.newCandidate("Matias", presidentialElection.getPoliticalParty("Derecha"));
        presidentialElection.newCandidate("Horacio", presidentialElection.getPoliticalParty("Izquierda"));
        presidentialElection.newCandidate("Sandra", presidentialElection.getPoliticalParty("Izquierda"));

        presidentialElection.newVote(SAN_LUIS, presidentialElection.getCandidate("Lucas"));
        presidentialElection.newVote(CATAMARCA, presidentialElection.getCandidate("Lucas"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(MENDOZA, presidentialElection.getCandidate("Horacio"));
        presidentialElection.newVote(SAN_LUIS, presidentialElection.getCandidate("Lucas"));

        Assert.assertEquals("Matias", presidentialElection.nationallyMostVotedCandidate(presidentialElection.candidates));

    }

    @Test
    public void provinciallyMostVotedCandidateTest(){

        presidentialElection = new PresidentialPrimaryElection();

        presidentialElection.newPoliticalParty("Derecha");
        presidentialElection.newPoliticalParty("Izquierda");
        presidentialElection.newCandidate("Lucas", presidentialElection.getPoliticalParty("Derecha"));
        presidentialElection.newCandidate("Matias", presidentialElection.getPoliticalParty("Derecha"));
        presidentialElection.newCandidate("Horacio", presidentialElection.getPoliticalParty("Izquierda"));
        presidentialElection.newCandidate("Sandra", presidentialElection.getPoliticalParty("Izquierda"));

        presidentialElection.newVote(SAN_LUIS, presidentialElection.getCandidate("Lucas"));
        presidentialElection.newVote(CATAMARCA, presidentialElection.getCandidate("Lucas"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(MENDOZA, presidentialElection.getCandidate("Horacio"));
        presidentialElection.newVote(SAN_LUIS, presidentialElection.getCandidate("Lucas"));


        Assert.assertEquals("Lucas", presidentialElection.provinciallyMostVotedCandidate(CATAMARCA, presidentialElection.candidates));

    }


    @Test
    public void provinciallyMostVotedCandidateTest2(){

        presidentialElection = new PresidentialPrimaryElection();

        presidentialElection.newPoliticalParty("Derecha");
        presidentialElection.newPoliticalParty("Izquierda");
        presidentialElection.newCandidate("Lucas", presidentialElection.getPoliticalParty("Derecha"));
        presidentialElection.newCandidate("Matias", presidentialElection.getPoliticalParty("Derecha"));
        presidentialElection.newCandidate("Horacio", presidentialElection.getPoliticalParty("Izquierda"));
        presidentialElection.newCandidate("Sandra", presidentialElection.getPoliticalParty("Izquierda"));

        presidentialElection.newVote(SAN_LUIS, presidentialElection.getCandidate("Lucas"));
        presidentialElection.newVote(CATAMARCA, presidentialElection.getCandidate("Lucas"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Lucas"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Lucas"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Lucas"));
        presidentialElection.newVote(MENDOZA, presidentialElection.getCandidate("Horacio"));
        presidentialElection.newVote(MISIONES, presidentialElection.getCandidate("Horacio"));
        presidentialElection.newVote(MENDOZA, presidentialElection.getCandidate("Sandra"));
        presidentialElection.newVote(JUJUY, presidentialElection.getCandidate("Horacio"));
        presidentialElection.newVote(MENDOZA, presidentialElection.getCandidate("Sandra"));
        presidentialElection.newVote(CABA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(SAN_LUIS, presidentialElection.getCandidate("Lucas"));



        Assert.assertEquals("Lucas", presidentialElection.provinciallyMostVotedCandidate(LA_RIOJA, presidentialElection.candidates));

    }

    @Test
    public void nationallyMostVotedPoliticalPartyTest(){

        presidentialElection = new PresidentialPrimaryElection();

        presidentialElection.newPoliticalParty("Derecha");
        presidentialElection.newPoliticalParty("Izquierda");
        presidentialElection.newCandidate("Lucas", presidentialElection.getPoliticalParty("Derecha"));
        presidentialElection.newCandidate("Matias", presidentialElection.getPoliticalParty("Derecha"));
        presidentialElection.newCandidate("Horacio", presidentialElection.getPoliticalParty("Izquierda"));
        presidentialElection.newCandidate("Sandra", presidentialElection.getPoliticalParty("Izquierda"));

        presidentialElection.newVote(SAN_LUIS, presidentialElection.getCandidate("Lucas"));
        presidentialElection.newVote(CATAMARCA, presidentialElection.getCandidate("Lucas"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Sandra"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Horacio"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(MENDOZA, presidentialElection.getCandidate("Horacio"));
        presidentialElection.newVote(MENDOZA, presidentialElection.getCandidate("Horacio"));
        presidentialElection.newVote(SAN_LUIS, presidentialElection.getCandidate("Lucas"));



        Assert.assertEquals("Derecha", presidentialElection.nationallyMostVotedParty(presidentialElection.candidates));

    }

    @Test
    public void nationallyMostVotedPoliticalPartyTest2(){

        presidentialElection = new PresidentialPrimaryElection();

        presidentialElection.newPoliticalParty("Derecha");
        presidentialElection.newPoliticalParty("Izquierda");
        presidentialElection.newCandidate("Lucas", presidentialElection.getPoliticalParty("Derecha"));
        presidentialElection.newCandidate("Matias", presidentialElection.getPoliticalParty("Derecha"));
        presidentialElection.newCandidate("Horacio", presidentialElection.getPoliticalParty("Izquierda"));
        presidentialElection.newCandidate("Sandra", presidentialElection.getPoliticalParty("Izquierda"));

        presidentialElection.newVote(SAN_LUIS, presidentialElection.getCandidate("Horacio"));
        presidentialElection.newVote(CATAMARCA, presidentialElection.getCandidate("Sandra"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Horacio"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Sandra"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(MENDOZA, presidentialElection.getCandidate("Horacio"));
        presidentialElection.newVote(SAN_LUIS, presidentialElection.getCandidate("Lucas"));



        Assert.assertEquals("", presidentialElection.provinciallyMostVotedCandidate(JUJUY, presidentialElection.candidates));

    }

    @Test
    public void provinciallyMostVotedPoliticalPartyTest(){

        presidentialElection = new PresidentialPrimaryElection();

        presidentialElection.newPoliticalParty("Derecha");
        presidentialElection.newPoliticalParty("Izquierda");
        presidentialElection.newCandidate("Lucas", presidentialElection.getPoliticalParty("Derecha"));
        presidentialElection.newCandidate("Matias", presidentialElection.getPoliticalParty("Derecha"));
        presidentialElection.newCandidate("Horacio", presidentialElection.getPoliticalParty("Izquierda"));
        presidentialElection.newCandidate("Sandra", presidentialElection.getPoliticalParty("Izquierda"));

        presidentialElection.newVote(SAN_LUIS, presidentialElection.getCandidate("Lucas"));
        presidentialElection.newVote(CATAMARCA, presidentialElection.getCandidate("Lucas"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(MENDOZA, presidentialElection.getCandidate("Horacio"));
        presidentialElection.newVote(SAN_LUIS, presidentialElection.getCandidate("Lucas"));



        Assert.assertEquals("Izquierda", presidentialElection.provinciallyMostVotedParty(MENDOZA, presidentialElection.candidates));

    }

    @Test
    public void provinciallyMostVotedPoliticalPartyTest2(){

        presidentialElection = new PresidentialPrimaryElection();

        presidentialElection.newPoliticalParty("Derecha");
        presidentialElection.newPoliticalParty("Izquierda");
        presidentialElection.newCandidate("Lucas", presidentialElection.getPoliticalParty("Derecha"));
        presidentialElection.newCandidate("Matias", presidentialElection.getPoliticalParty("Derecha"));
        presidentialElection.newCandidate("Horacio", presidentialElection.getPoliticalParty("Izquierda"));
        presidentialElection.newCandidate("Sandra", presidentialElection.getPoliticalParty("Izquierda"));

        presidentialElection.newVote(SAN_LUIS, presidentialElection.getCandidate("Lucas"));
        presidentialElection.newVote(CATAMARCA, presidentialElection.getCandidate("Lucas"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(LA_RIOJA, presidentialElection.getCandidate("Matias"));
        presidentialElection.newVote(MENDOZA, presidentialElection.getCandidate("Horacio"));
        presidentialElection.newVote(SAN_LUIS, presidentialElection.getCandidate("Lucas"));
        presidentialElection.newVote(SAN_LUIS, presidentialElection.getCandidate("Horacio"));



        Assert.assertEquals("Derecha", presidentialElection.provinciallyMostVotedParty(SAN_LUIS, presidentialElection.candidates));

    }


}
