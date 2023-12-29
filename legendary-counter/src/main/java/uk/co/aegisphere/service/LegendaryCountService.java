package uk.co.aegisphere.service;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.reactive.function.client.WebClient;
import uk.co.aegisphere.model.Count;
import uk.co.aegisphere.model.Result;
import uk.co.aegisphere.properties.ImxProperties;

import static uk.co.aegisphere.utility.Constants.*;

@RequiredArgsConstructor
public class LegendaryCountService {
    private final WebClient.Builder webClient;
    private final ImxProperties imxProperties;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private Count count = new Count();

    public Count getCollectionDetails() {
        logger.info("Counting all LEGENDARY Closed Beta cards:");
        /** EMPERORS */
        count.setAlienEmperorBase(generateMetadataForApiCall(BASE_EDITION, ALIEN_EMPEROR, LEGENDARY, CLOSED_BETA));
        count.setAlienEmperorPremium(generateMetadataForApiCall(PREMIUM_EDITION, ALIEN_EMPEROR, LEGENDARY, CLOSED_BETA));
        count.setAlienEmperorFounders(generateMetadataForApiCall(FOUNDERS_EDITION, ALIEN_EMPEROR, LEGENDARY, CLOSED_BETA));
        count.setHumanEmperorBase(generateMetadataForApiCall(BASE_EDITION, HUMAN_EMPEROR, LEGENDARY, CLOSED_BETA));
        count.setHumanEmperorPremium(generateMetadataForApiCall(PREMIUM_EDITION, HUMAN_EMPEROR, LEGENDARY, CLOSED_BETA));
        count.setHumanEmperorFounders(generateMetadataForApiCall(FOUNDERS_EDITION, HUMAN_EMPEROR, LEGENDARY, CLOSED_BETA));
        /** HUMANS HEROES*/
        count.setFigyuBase(generateMetadataForApiCall(BASE_EDITION, FIGYU, LEGENDARY, CLOSED_BETA));
        count.setFigyuPremium(generateMetadataForApiCall(PREMIUM_EDITION, FIGYU, LEGENDARY, CLOSED_BETA));
        count.setFigyuFounders(generateMetadataForApiCall(FOUNDERS_EDITION, FIGYU, LEGENDARY, CLOSED_BETA));
        count.setTalosBase(generateMetadataForApiCall(BASE_EDITION, TALOS, LEGENDARY, CLOSED_BETA));
        count.setTalosPremium(generateMetadataForApiCall(PREMIUM_EDITION,TALOS, LEGENDARY, CLOSED_BETA));
        count.setTalosFounders(generateMetadataForApiCall(FOUNDERS_EDITION, TALOS, LEGENDARY, CLOSED_BETA));
        count.setMelcroseBase(generateMetadataForApiCall(BASE_EDITION, MELCROSE, LEGENDARY, CLOSED_BETA));
        count.setMelcrosePremium(generateMetadataForApiCall(PREMIUM_EDITION, MELCROSE, LEGENDARY, CLOSED_BETA));
        count.setMelcroseFounders(generateMetadataForApiCall(FOUNDERS_EDITION, MELCROSE, LEGENDARY, CLOSED_BETA));
        count.setStemimaBase(generateMetadataForApiCall(BASE_EDITION, STEMIMA, LEGENDARY, CLOSED_BETA));
        count.setStemimaPremium(generateMetadataForApiCall(PREMIUM_EDITION, STEMIMA, LEGENDARY, CLOSED_BETA));
        count.setStemimaFounders(generateMetadataForApiCall(FOUNDERS_EDITION, STEMIMA, LEGENDARY, CLOSED_BETA));
        count.setLeviathanBase(generateMetadataForApiCall(BASE_EDITION, LEVIATHAN, LEGENDARY, CLOSED_BETA));
        count.setLeviathanPremium(generateMetadataForApiCall(PREMIUM_EDITION, LEVIATHAN, LEGENDARY, CLOSED_BETA));
        count.setLeviathanFounders(generateMetadataForApiCall(FOUNDERS_EDITION, LEVIATHAN, LEGENDARY, CLOSED_BETA));
        /** ALIENS HEROES */
        count.setDagonBase(generateMetadataForApiCall(BASE_EDITION, DAGON, LEGENDARY, CLOSED_BETA));
        count.setDagonPremium(generateMetadataForApiCall(PREMIUM_EDITION, DAGON, LEGENDARY, CLOSED_BETA));
        count.setDagonFounders(generateMetadataForApiCall(FOUNDERS_EDITION, DAGON, LEGENDARY, CLOSED_BETA));
        count.setApollyonBase(generateMetadataForApiCall(BASE_EDITION, APOLLYON, LEGENDARY, CLOSED_BETA));
        count.setApollyonPremium(generateMetadataForApiCall(PREMIUM_EDITION, APOLLYON, LEGENDARY, CLOSED_BETA));
        count.setApollyonFounders(generateMetadataForApiCall(FOUNDERS_EDITION, APOLLYON, LEGENDARY, CLOSED_BETA));
        count.setChemoshBase(generateMetadataForApiCall(BASE_EDITION, CHEMOSH, LEGENDARY, CLOSED_BETA));
        count.setChemoshPremium(generateMetadataForApiCall(PREMIUM_EDITION, CHEMOSH, LEGENDARY, CLOSED_BETA));
        count.setChemoshFounders(generateMetadataForApiCall(FOUNDERS_EDITION, CHEMOSH, LEGENDARY, CLOSED_BETA));
        count.setSartosisBase(generateMetadataForApiCall(BASE_EDITION, SARTOSIS, LEGENDARY, CLOSED_BETA));
        count.setSartosisPremium(generateMetadataForApiCall(PREMIUM_EDITION, SARTOSIS, LEGENDARY, CLOSED_BETA));
        count.setSartosisFounders(generateMetadataForApiCall(FOUNDERS_EDITION, SARTOSIS, LEGENDARY, CLOSED_BETA));
        count.setArchonBase(generateMetadataForApiCall(BASE_EDITION, ARCHON, LEGENDARY, CLOSED_BETA));
        count.setArchonPremium(generateMetadataForApiCall(PREMIUM_EDITION, ARCHON, LEGENDARY, CLOSED_BETA));
        count.setArchonFounders(generateMetadataForApiCall(FOUNDERS_EDITION, ARCHON, LEGENDARY, CLOSED_BETA));
        /** TROOPS */
        count.setWagmiTroopsBase(generateMetadataForApiCall(BASE_EDITION,WAGMI_TROOPS, LEGENDARY, CLOSED_BETA));
        count.setWagmiTroopsPremium(generateMetadataForApiCall(PREMIUM_EDITION, WAGMI_TROOPS, LEGENDARY, CLOSED_BETA));
        count.setWagmiTroopsFounders(generateMetadataForApiCall(FOUNDERS_EDITION, WAGMI_TROOPS, LEGENDARY, CLOSED_BETA));
        count.setEnoguardsBase(generateMetadataForApiCall(BASE_EDITION, ENOGUARDS, LEGENDARY, CLOSED_BETA));
        count.setEnoguardsPremium(generateMetadataForApiCall(PREMIUM_EDITION, ENOGUARDS, LEGENDARY, CLOSED_BETA));
        count.setEnoguardsFounders(generateMetadataForApiCall(FOUNDERS_EDITION, ENOGUARDS, LEGENDARY, CLOSED_BETA));
        count.setScrappersBase(generateMetadataForApiCall(BASE_EDITION, SCRAPPERS, LEGENDARY, CLOSED_BETA));
        count.setScrapperPremium(generateMetadataForApiCall(PREMIUM_EDITION, SCRAPPERS, LEGENDARY, CLOSED_BETA));
        count.setScrappersFounders(generateMetadataForApiCall(FOUNDERS_EDITION, SCRAPPERS, LEGENDARY, CLOSED_BETA));
        count.setManicritesBase(generateMetadataForApiCall(BASE_EDITION, MANICRITES, LEGENDARY, CLOSED_BETA));
        count.setManicritesPremium(generateMetadataForApiCall(PREMIUM_EDITION, MANICRITES, LEGENDARY, CLOSED_BETA));
        count.setManicritesPremium(generateMetadataForApiCall(FOUNDERS_EDITION, MANICRITES, LEGENDARY, CLOSED_BETA));
        count.setImmortalsBase(generateMetadataForApiCall(BASE_EDITION, IMMORTALS, LEGENDARY, CLOSED_BETA));
        count.setImmortalsPremium(generateMetadataForApiCall(PREMIUM_EDITION, IMMORTALS, LEGENDARY, CLOSED_BETA));
        count.setImmortalsFounders(generateMetadataForApiCall(FOUNDERS_EDITION, IMMORTALS, LEGENDARY, CLOSED_BETA));
        count.setSaraguardsBase(generateMetadataForApiCall(BASE_EDITION, SARAGUARDS, LEGENDARY, CLOSED_BETA));
        count.setSaraguardsPremium(generateMetadataForApiCall(PREMIUM_EDITION, SARAGUARDS, LEGENDARY, CLOSED_BETA));
        count.setSaraguardsFounders(generateMetadataForApiCall(FOUNDERS_EDITION, SARAGUARDS, LEGENDARY, CLOSED_BETA));
        /** SPELLS */
        count.setShockwaveBase(generateMetadataForApiCall(BASE_EDITION, SHOCKWAVE, LEGENDARY, CLOSED_BETA));
        count.setShockwavePremium(generateMetadataForApiCall(PREMIUM_EDITION, SHOCKWAVE, LEGENDARY, CLOSED_BETA));
        count.setShockwaveFounders(generateMetadataForApiCall(FOUNDERS_EDITION, SHOCKWAVE, LEGENDARY, CLOSED_BETA));
        count.setPlasmaBlastBase(generateMetadataForApiCall(BASE_EDITION, PLASMABLAST, LEGENDARY, CLOSED_BETA));
        count.setPlasmaBlastPremium(generateMetadataForApiCall(PREMIUM_EDITION, PLASMABLAST, LEGENDARY, CLOSED_BETA));
        count.setPlasmaBlastFounders(generateMetadataForApiCall(FOUNDERS_EDITION, PLASMABLAST, LEGENDARY, CLOSED_BETA));
        count.setCosmicRainBase(generateMetadataForApiCall(BASE_EDITION, COSMICRAIN, LEGENDARY, CLOSED_BETA));
        count.setCosmicRainPremium(generateMetadataForApiCall(PREMIUM_EDITION, COSMICRAIN, LEGENDARY, CLOSED_BETA));
        count.setCosmicRainFounders(generateMetadataForApiCall(FOUNDERS_EDITION, COSMICRAIN, LEGENDARY, CLOSED_BETA));
        count.setAuroraBeamBase(generateMetadataForApiCall(BASE_EDITION, AURORABEAM, LEGENDARY, CLOSED_BETA));
        count.setAuroraBeamPremium(generateMetadataForApiCall(PREMIUM_EDITION, AURORABEAM, LEGENDARY, CLOSED_BETA));
        count.setAuroraBeamFounders(generateMetadataForApiCall(FOUNDERS_EDITION, AURORABEAM, LEGENDARY, CLOSED_BETA));
        /** SUPPORT */
        count.setGelenatankBase(generateMetadataForApiCall(BASE_EDITION, GELENATANK, LEGENDARY, CLOSED_BETA));
        count.setGelenatankPremium(generateMetadataForApiCall(PREMIUM_EDITION, GELENATANK, LEGENDARY, CLOSED_BETA));
        count.setGelenatankFounders(generateMetadataForApiCall(FOUNDERS_EDITION, GELENATANK, LEGENDARY, CLOSED_BETA));
        count.setChemotankBase(generateMetadataForApiCall(BASE_EDITION, CHEMOTANK, LEGENDARY, CLOSED_BETA));
        count.setChemotankPremium(generateMetadataForApiCall(PREMIUM_EDITION, CHEMOTANK, LEGENDARY, CLOSED_BETA));
        count.setChemotankFounders(generateMetadataForApiCall(FOUNDERS_EDITION, CHEMOTANK, LEGENDARY, CLOSED_BETA));
        count.setObixSharpshooterBase();
        count.setObixSharpshooterPremium();
        count.setObixSharpshooterFounders();
        count.setIonInterscoperBase();
        count.setIonInterscoperPremium();
        count.setIonInterscoperFounders();
        return count;
    }

    public int generateMetadataForApiCall(String edition, String name, String rarity, String season) {
        String meteDataEdition = imxProperties.getEdition().replace(EDITION_PLACEHOLDER, edition);
        String metaDataName = imxProperties.getName().replace(NAME_PLACEHOLDER, name);
        String rarityMetadata = imxProperties.getRarity().replace(RARITY_PLACEHOLDER, rarity);
        String seasonMetadata = imxProperties.getSeason().replace(SEASON_PLACEHOLDER, season);
        String url = imxProperties.getBaseUrl() + meteDataEdition + metaDataName + rarityMetadata + seasonMetadata;
        logger.info("Counting {} {} {}", season, rarity, name.replace("%20", " "));
        return getMintCount(url);
    }

    public int getMintCount(String url) {
        int runningTotal;
        Result result = retrieveDetails(url);
        runningTotal = (result.getResult().length);
        logger.info("current Count: {}", runningTotal);

        boolean moreDataAvailable = (result.getCursor().isBlank()) ? false : true;
        String urlWithCursor = url + "&cursor=" + result.getCursor();

        while (moreDataAvailable) {
            try {
                result = retrieveDetails(urlWithCursor);
            } catch (Exception e) {
                logger.error("failed to retrieve next batch");
            }

            runningTotal += result.getResult().length;

            logger.info("totalCountSoFar: {}", runningTotal);

            if (result.getCursor().isBlank()) {
                moreDataAvailable = false;
            } else {
                urlWithCursor = url + "&cursor=" + result.getCursor();
            }
        }
        return runningTotal;
    }

    public Result retrieveDetails(String url) {
        return webClient.build().get()
                .uri(url)
                .retrieve()
                .bodyToMono(Result.class)
                .block();
    }
}

