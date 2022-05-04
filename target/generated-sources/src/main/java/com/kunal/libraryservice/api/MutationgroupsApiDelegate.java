package com.kunal.libraryservice.api;

import com.kunal.libraryservice.models.InlineResponse200;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link MutationgroupsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-04T10:33:33.915+05:30[Asia/Calcutta]")
public interface MutationgroupsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /mutationgroups/{mutationGroupId}/communications : Sending communication doc to user
     * Create Communication doc functionality
     *
     * @param mutationGroupId The Mutation GroupId (required)
     * @param policyUUID PolicyUUIDto fetch response data (required)
     * @return Successful operation (status code 200)
     *         or Invalid PolicyUUID supplied (status code 400)
     *         or Details not found (status code 404)
     * @see MutationgroupsApi#communicationDoc
     */
    default ResponseEntity<InlineResponse200> communicationDoc(Integer mutationGroupId,
        String policyUUID) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"value\" : { \"communicatedMutations\" : { \"level\" : \"level\", \"ignoreMutationInCommunication\" : \"ignoreMutationInCommunication\", \"mutationType\" : \"mutationType\", \"effectivityStartDate\" : \"effectivityStartDate\", \"mutationHolderId\" : \"mutationHolderId\", \"mutationParagraph\" : { \"code\" : \"code\", \"freeText\" : \"freeText\", \"standardText\" : \"standardText\", \"name\" : [ \"name\", \"name\" ] }, \"businessCase\" : \"businessCase\", \"subNumber\" : \"subNumber\" }, \"templateName\" : \"templateName\", \"policyUUID\" : \"policyUUID\", \"paragraphConcerns\" : { \"code\" : \"code\", \"freeText\" : \"freeText\", \"standardText\" : \"standardText\", \"name\" : [ \"name\", \"name\" ] }, \"communicatedDocuments\" : { \"validDocumentRecipientList\" : [ { \"isVisibleForCoCorrespondent\" : \"isVisibleForCoCorrespondent\", \"isVisibleForMainCorrespondent\" : \"isVisibleForMainCorrespondent\", \"isSelectableForMainCorrespondent\" : \"isSelectableForMainCorrespondent\", \"isSelectableForCoCorrespondent\" : \"isSelectableForCoCorrespondent\", \"documentRecipient\" : \"documentRecipient\" }, { \"isVisibleForCoCorrespondent\" : \"isVisibleForCoCorrespondent\", \"isVisibleForMainCorrespondent\" : \"isVisibleForMainCorrespondent\", \"isSelectableForMainCorrespondent\" : \"isSelectableForMainCorrespondent\", \"isSelectableForCoCorrespondent\" : \"isSelectableForCoCorrespondent\", \"documentRecipient\" : \"documentRecipient\" } ], \"addenda\" : [ { \"templateCategory\" : \"templateCategory\", \"includeModificationEnabled\" : \"includeModificationEnabled\", \"included\" : \"included\" }, { \"templateCategory\" : \"templateCategory\", \"includeModificationEnabled\" : \"includeModificationEnabled\", \"included\" : \"included\" } ], \"standardAddenda\" : [ { \"standardAnnexTypeId\" : \"standardAnnexTypeId\", \"description\" : \"description\", \"standardAnnexId\" : \"standardAnnexId\", \"abbreviation\" : \"abbreviation\", \"annexTypeName\" : \"annexTypeName\", \"included\" : \"included\" }, { \"standardAnnexTypeId\" : \"standardAnnexTypeId\", \"description\" : \"description\", \"standardAnnexId\" : \"standardAnnexId\", \"abbreviation\" : \"abbreviation\", \"annexTypeName\" : \"annexTypeName\", \"included\" : \"included\" } ], \"mainCorrespondent\" : { \"copyBrokerDisabled\" : \"copyBrokerDisabled\", \"copyBrokerChecked\" : \"copyBrokerChecked\", \"recipient\" : \"recipient\", \"sendingChannel\" : \"sendingChannel\" } }, \"communicatedInspMutations\" : [ { \"simpleCommunicationDocOverview\" : { \"validDocumentRecipientList\" : { \"validDocumentRecipient\" : { \"isVisibleForCoCorrespondent\" : \"isVisibleForCoCorrespondent\", \"isVisibleForMainCorrespondent\" : \"isVisibleForMainCorrespondent\", \"isSelectableForMainCorrespondent\" : \"isSelectableForMainCorrespondent\", \"isSelectableForCoCorrespondent\" : \"isSelectableForCoCorrespondent\", \"documentRecipient\" : \"documentRecipient\" } }, \"addenda\" : { \"templateCategory\" : \"templateCategory\", \"includeModificationEnabled\" : \"includeModificationEnabled\", \"included\" : \"included\" }, \"mainCorrespondent\" : { \"copyBrokerDisabled\" : \"copyBrokerDisabled\", \"copyBrokerChecked\" : \"copyBrokerChecked\", \"recipient\" : \"recipient\", \"sendingChannel\" : \"sendingChannel\" }, \"subNumber\" : \"subNumber\" }, \"subNumber\" : \"subNumber\" }, { \"simpleCommunicationDocOverview\" : { \"validDocumentRecipientList\" : { \"validDocumentRecipient\" : { \"isVisibleForCoCorrespondent\" : \"isVisibleForCoCorrespondent\", \"isVisibleForMainCorrespondent\" : \"isVisibleForMainCorrespondent\", \"isSelectableForMainCorrespondent\" : \"isSelectableForMainCorrespondent\", \"isSelectableForCoCorrespondent\" : \"isSelectableForCoCorrespondent\", \"documentRecipient\" : \"documentRecipient\" } }, \"addenda\" : { \"templateCategory\" : \"templateCategory\", \"includeModificationEnabled\" : \"includeModificationEnabled\", \"included\" : \"included\" }, \"mainCorrespondent\" : { \"copyBrokerDisabled\" : \"copyBrokerDisabled\", \"copyBrokerChecked\" : \"copyBrokerChecked\", \"recipient\" : \"recipient\", \"sendingChannel\" : \"sendingChannel\" }, \"subNumber\" : \"subNumber\" }, \"subNumber\" : \"subNumber\" } ], \"language\" : \"language\", \"paragraphsPayment\" : { \"code\" : \"code\", \"freeText\" : \"freeText\", \"standardText\" : \"standardText\", \"name\" : [ \"name\", \"name\" ] }, \"templateCode\" : \"templateCode\", \"documentTypeProperties\" : { \"povc\" : \"povc\", \"subType\" : \"subType\", \"fileType\" : \"fileType\" }, \"useOpenBalance\" : \"useOpenBalance\", \"paragraphIntroduction\" : { \"code\" : \"code\", \"freeText\" : \"freeText\", \"standardText\" : \"standardText\", \"name\" : [ \"name\", \"name\" ] } } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
