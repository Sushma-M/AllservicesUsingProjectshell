/*Copyright (c) 2016-2017 vcstest4.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest4.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest4.com*/
package com.testallservicesforvcs.adventureworks2014.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.util.Map;

import org.joda.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.runtime.data.exception.EntityNotFoundException;
import com.wavemaker.runtime.data.export.ExportType;
import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.model.AggregationInfo;
import com.wavemaker.runtime.file.model.Downloadable;
import com.wavemaker.tools.api.core.annotations.WMAccessVisibility;
import com.wavemaker.tools.api.core.models.AccessSpecifier;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

import com.testallservicesforvcs.adventureworks2014.VjobCandidateEducation;
import com.testallservicesforvcs.adventureworks2014.VjobCandidateEducationId;
import com.testallservicesforvcs.adventureworks2014.service.VjobCandidateEducationService;


/**
 * Controller object for domain model class VjobCandidateEducation.
 * @see VjobCandidateEducation
 */
@RestController("AdventureWorks2014.VjobCandidateEducationController")
@Api(value = "VjobCandidateEducationController", description = "Exposes APIs to work with VjobCandidateEducation resource.")
@RequestMapping("/AdventureWorks2014/VjobCandidateEducation")
public class VjobCandidateEducationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(VjobCandidateEducationController.class);

    @Autowired
	@Qualifier("AdventureWorks2014.VjobCandidateEducationService")
	private VjobCandidateEducationService vjobCandidateEducationService;

	@ApiOperation(value = "Creates a new VjobCandidateEducation instance.")
    @RequestMapping(method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public VjobCandidateEducation createVjobCandidateEducation(@RequestBody VjobCandidateEducation vjobCandidateEducation) {
		LOGGER.debug("Create VjobCandidateEducation with information: {}" , vjobCandidateEducation);

		vjobCandidateEducation = vjobCandidateEducationService.create(vjobCandidateEducation);
		LOGGER.debug("Created VjobCandidateEducation with information: {}" , vjobCandidateEducation);

	    return vjobCandidateEducation;
	}

@ApiOperation(value = "Returns the VjobCandidateEducation instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public VjobCandidateEducation getVjobCandidateEducation(@RequestParam("jobCandidateId") Integer jobCandidateId,@RequestParam("edu_level") String edu_level,@RequestParam("edu_startDate") LocalDateTime edu_startDate,@RequestParam("edu_endDate") LocalDateTime edu_endDate,@RequestParam("edu_degree") String edu_degree,@RequestParam("edu_major") String edu_major,@RequestParam("edu_minor") String edu_minor,@RequestParam("edu_gpa") String edu_gpa,@RequestParam("edu_gpascale") String edu_gpascale,@RequestParam("edu_school") String edu_school,@RequestParam("edu_loc_countryRegion") String edu_loc_countryRegion,@RequestParam("edu_loc_state") String edu_loc_state,@RequestParam("edu_loc_city") String edu_loc_city) throws EntityNotFoundException {

        VjobCandidateEducationId vjobcandidateeducationId = new VjobCandidateEducationId();
        vjobcandidateeducationId.setJobCandidateId(jobCandidateId);
        vjobcandidateeducationId.setEdu_level(edu_level);
        vjobcandidateeducationId.setEdu_startDate(edu_startDate);
        vjobcandidateeducationId.setEdu_endDate(edu_endDate);
        vjobcandidateeducationId.setEdu_degree(edu_degree);
        vjobcandidateeducationId.setEdu_major(edu_major);
        vjobcandidateeducationId.setEdu_minor(edu_minor);
        vjobcandidateeducationId.setEdu_gpa(edu_gpa);
        vjobcandidateeducationId.setEdu_gpascale(edu_gpascale);
        vjobcandidateeducationId.setEdu_school(edu_school);
        vjobcandidateeducationId.setEdu_loc_countryRegion(edu_loc_countryRegion);
        vjobcandidateeducationId.setEdu_loc_state(edu_loc_state);
        vjobcandidateeducationId.setEdu_loc_city(edu_loc_city);

        LOGGER.debug("Getting VjobCandidateEducation with id: {}" , vjobcandidateeducationId);
        VjobCandidateEducation vjobCandidateEducation = vjobCandidateEducationService.getById(vjobcandidateeducationId);
        LOGGER.debug("VjobCandidateEducation details with id: {}" , vjobCandidateEducation);

        return vjobCandidateEducation;
    }



    @ApiOperation(value = "Updates the VjobCandidateEducation instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.PUT)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public VjobCandidateEducation editVjobCandidateEducation(@RequestParam("jobCandidateId") Integer jobCandidateId,@RequestParam("edu_level") String edu_level,@RequestParam("edu_startDate") LocalDateTime edu_startDate,@RequestParam("edu_endDate") LocalDateTime edu_endDate,@RequestParam("edu_degree") String edu_degree,@RequestParam("edu_major") String edu_major,@RequestParam("edu_minor") String edu_minor,@RequestParam("edu_gpa") String edu_gpa,@RequestParam("edu_gpascale") String edu_gpascale,@RequestParam("edu_school") String edu_school,@RequestParam("edu_loc_countryRegion") String edu_loc_countryRegion,@RequestParam("edu_loc_state") String edu_loc_state,@RequestParam("edu_loc_city") String edu_loc_city, @RequestBody VjobCandidateEducation vjobCandidateEducation) throws EntityNotFoundException {

        vjobCandidateEducation.setJobCandidateId(jobCandidateId);
        vjobCandidateEducation.setEdu_level(edu_level);
        vjobCandidateEducation.setEdu_startDate(edu_startDate);
        vjobCandidateEducation.setEdu_endDate(edu_endDate);
        vjobCandidateEducation.setEdu_degree(edu_degree);
        vjobCandidateEducation.setEdu_major(edu_major);
        vjobCandidateEducation.setEdu_minor(edu_minor);
        vjobCandidateEducation.setEdu_gpa(edu_gpa);
        vjobCandidateEducation.setEdu_gpascale(edu_gpascale);
        vjobCandidateEducation.setEdu_school(edu_school);
        vjobCandidateEducation.setEdu_loc_countryRegion(edu_loc_countryRegion);
        vjobCandidateEducation.setEdu_loc_state(edu_loc_state);
        vjobCandidateEducation.setEdu_loc_city(edu_loc_city);

        LOGGER.debug("VjobCandidateEducation details with id is updated with: {}" , vjobCandidateEducation);

        return vjobCandidateEducationService.update(vjobCandidateEducation);
    }


    @ApiOperation(value = "Deletes the VjobCandidateEducation instance associated with the given composite-id.")
    @RequestMapping(value = "/composite-id", method = RequestMethod.DELETE)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public boolean deleteVjobCandidateEducation(@RequestParam("jobCandidateId") Integer jobCandidateId,@RequestParam("edu_level") String edu_level,@RequestParam("edu_startDate") LocalDateTime edu_startDate,@RequestParam("edu_endDate") LocalDateTime edu_endDate,@RequestParam("edu_degree") String edu_degree,@RequestParam("edu_major") String edu_major,@RequestParam("edu_minor") String edu_minor,@RequestParam("edu_gpa") String edu_gpa,@RequestParam("edu_gpascale") String edu_gpascale,@RequestParam("edu_school") String edu_school,@RequestParam("edu_loc_countryRegion") String edu_loc_countryRegion,@RequestParam("edu_loc_state") String edu_loc_state,@RequestParam("edu_loc_city") String edu_loc_city) throws EntityNotFoundException {

        VjobCandidateEducationId vjobcandidateeducationId = new VjobCandidateEducationId();
        vjobcandidateeducationId.setJobCandidateId(jobCandidateId);
        vjobcandidateeducationId.setEdu_level(edu_level);
        vjobcandidateeducationId.setEdu_startDate(edu_startDate);
        vjobcandidateeducationId.setEdu_endDate(edu_endDate);
        vjobcandidateeducationId.setEdu_degree(edu_degree);
        vjobcandidateeducationId.setEdu_major(edu_major);
        vjobcandidateeducationId.setEdu_minor(edu_minor);
        vjobcandidateeducationId.setEdu_gpa(edu_gpa);
        vjobcandidateeducationId.setEdu_gpascale(edu_gpascale);
        vjobcandidateeducationId.setEdu_school(edu_school);
        vjobcandidateeducationId.setEdu_loc_countryRegion(edu_loc_countryRegion);
        vjobcandidateeducationId.setEdu_loc_state(edu_loc_state);
        vjobcandidateeducationId.setEdu_loc_city(edu_loc_city);

        LOGGER.debug("Deleting VjobCandidateEducation with id: {}" , vjobcandidateeducationId);
        VjobCandidateEducation vjobCandidateEducation = vjobCandidateEducationService.delete(vjobcandidateeducationId);

        return vjobCandidateEducation != null;
    }


    /**
     * @deprecated Use {@link #findVjobCandidateEducations(String, Pageable)} instead.
     */
    @Deprecated
    @ApiOperation(value = "Returns the list of VjobCandidateEducation instances matching the search criteria.")
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<VjobCandidateEducation> searchVjobCandidateEducationsByQueryFilters( Pageable pageable, @RequestBody QueryFilter[] queryFilters) {
        LOGGER.debug("Rendering VjobCandidateEducations list");
        return vjobCandidateEducationService.findAll(queryFilters, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of VjobCandidateEducation instances matching the optional query (q) request param. If there is no query provided, it returns all the instances. Pagination & Sorting parameters such as page& size, sort can be sent as request parameters. The sort value should be a comma separated list of field names & optional sort order to sort the data on. eg: field1 asc, field2 desc etc ")
    @RequestMapping(method = RequestMethod.GET)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<VjobCandidateEducation> findVjobCandidateEducations(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering VjobCandidateEducations list");
        return vjobCandidateEducationService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns the paginated list of VjobCandidateEducation instances matching the optional query (q) request param. This API should be used only if the query string is too big to fit in GET request with request param. The request has to made in application/x-www-form-urlencoded format.")
    @RequestMapping(value="/filter", method = RequestMethod.POST, consumes= "application/x-www-form-urlencoded")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Page<VjobCandidateEducation> filterVjobCandidateEducations(@ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
        LOGGER.debug("Rendering VjobCandidateEducations list");
        return vjobCandidateEducationService.findAll(query, pageable);
    }

    @ApiOperation(value = "Returns downloadable file for the data matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
    @RequestMapping(value = "/export/{exportType}", method = {RequestMethod.GET,  RequestMethod.POST}, produces = "application/octet-stream")
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
    public Downloadable exportVjobCandidateEducations(@PathVariable("exportType") ExportType exportType, @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query, Pageable pageable) {
         return vjobCandidateEducationService.export(exportType, query, pageable);
    }

	@ApiOperation(value = "Returns the total count of VjobCandidateEducation instances matching the optional query (q) request param. If query string is too big to fit in GET request's query param, use POST method with application/x-www-form-urlencoded format.")
	@RequestMapping(value = "/count", method = {RequestMethod.GET, RequestMethod.POST})
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Long countVjobCandidateEducations( @ApiParam("conditions to filter the results") @RequestParam(value = "q", required = false) String query) {
		LOGGER.debug("counting VjobCandidateEducations");
		return vjobCandidateEducationService.count(query);
	}

    @ApiOperation(value = "Returns aggregated result with given aggregation info")
	@RequestMapping(value = "/aggregations", method = RequestMethod.POST)
    @WMAccessVisibility(value = AccessSpecifier.APP_ONLY)
	public Page<Map<String, Object>> getVjobCandidateEducationAggregatedValues(@RequestBody AggregationInfo aggregationInfo, Pageable pageable) {
        LOGGER.debug("Fetching aggregated results for {}", aggregationInfo);
        return vjobCandidateEducationService.getAggregatedValues(aggregationInfo, pageable);
    }


    /**
	 * This setter method should only be used by unit tests
	 *
	 * @param service VjobCandidateEducationService instance
	 */
	protected void setVjobCandidateEducationService(VjobCandidateEducationService service) {
		this.vjobCandidateEducationService = service;
	}

}

