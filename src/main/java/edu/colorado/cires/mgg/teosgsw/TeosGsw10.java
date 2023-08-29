package edu.colorado.cires.mgg.teosgsw;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface TeosGsw10 extends Library {
  TeosGsw10 INSTANCE = Native.load("gswteos-10", TeosGsw10.class);
  void   gsw_add_barrier(double[] input_data, double lon, double lat,
      double long_grid, double lat_grid, double dlong_grid,
      double dlat_grid, double[] output_data);
  void   gsw_add_mean(double[] data_in, double[] data_out);
  double gsw_adiabatic_lapse_rate_from_ct(double sa, double ct, double p);
  double gsw_adiabatic_lapse_rate_ice(double t, double p);
  double gsw_alpha(double sa, double ct, double p);
  double gsw_alpha_on_beta(double sa, double ct, double p);
  double gsw_alpha_wrt_t_exact(double sa, double t, double p);
  double gsw_alpha_wrt_t_ice(double t, double p);
  double gsw_beta_const_t_exact(double sa, double t, double p);
  double gsw_beta(double sa, double ct, double p);
  double gsw_cabbeling(double sa, double ct, double p);
  double gsw_c_from_sp(double sp, double t, double p);
  double gsw_chem_potential_water_ice(double t, double p);
  double gsw_chem_potential_water_t_exact(double sa, double t, double p);
  double gsw_cp_ice(double t, double p);
  double gsw_cp_t_exact(double sa, double t, double p);
  void   gsw_ct_first_derivatives (double sa, double pt, double[] ct_sa,
      double[] ct_pt);
  void   gsw_ct_first_derivatives_wrt_t_exact(double sa, double t,
      double p, double[] ct_sa_wrt_t, double[] ct_t_wrt_t,
      double[] ct_p_wrt_t);
  double gsw_ct_freezing(double sa, double p, double saturation_fraction);
  void   gsw_ct_freezing_first_derivatives(double sa, double p,
      double saturation_fraction, double[] ctfreezing_sa,
      double[] ctfreezing_p);
  void   gsw_ct_freezing_first_derivatives_poly(double sa, double p,
      double saturation_fraction, double[] ctfreezing_sa,
      double[] ctfreezing_p);
  double gsw_ct_freezing_poly(double sa, double p,
      double saturation_fraction);
  double gsw_ct_from_enthalpy(double sa, double h, double p);
  double gsw_ct_from_enthalpy_exact(double sa, double h, double p);
  double gsw_ct_from_entropy(double sa, double entropy);
  double gsw_ct_from_pt(double sa, double pt);
  void   gsw_ct_from_rho(double rho, double sa, double p, double[] ct,
      double[] ct_multiple);
  double gsw_ct_from_t(double sa, double t, double p);
  double gsw_ct_maxdensity(double sa, double p);
  void   gsw_ct_second_derivatives(double sa, double pt, double[] ct_sa_sa,
      double[] ct_sa_pt, double[] ct_pt_pt);
  double gsw_deltasa_atlas(double p, double lon, double lat);
  double gsw_deltasa_from_sp(double sp, double p, double lon, double lat);
  double gsw_dilution_coefficient_t_exact(double sa, double t, double p);
  double gsw_dynamic_enthalpy(double sa, double ct, double p);
  double gsw_enthalpy_ct_exact(double sa, double ct, double p);
  double gsw_enthalpy_diff(double sa, double ct, double p_shallow,
      double p_deep);
  double gsw_enthalpy(double sa, double ct, double p);
  void   gsw_enthalpy_first_derivatives_ct_exact(double sa, double ct,
      double p, double[] h_sa, double[] h_ct);
  void   gsw_enthalpy_first_derivatives(double sa, double ct, double p,
      double[] h_sa, double[] h_ct);
  double gsw_enthalpy_ice(double t, double p);
  void   gsw_enthalpy_second_derivatives_ct_exact(double sa, double ct,
      double p, double[] h_sa_sa, double[] h_sa_ct, double[] h_ct_ct);
  void   gsw_enthalpy_second_derivatives(double sa, double ct, double p,
      double[] h_sa_sa, double[] h_sa_ct, double[] h_ct_ct);
  double gsw_enthalpy_sso_0(double p);
  double gsw_enthalpy_t_exact(double sa, double t, double p);
  void   gsw_entropy_first_derivatives(double sa, double ct,
      double[] eta_sa, double[] eta_ct);
  double gsw_entropy_from_ct(double sa, double ct);
  double gsw_entropy_from_pt(double sa, double pt);
  double gsw_entropy_from_t(double sa, double t, double p);
  double gsw_entropy_ice(double t, double p);
  double gsw_entropy_part(double sa, double t, double p);
  double gsw_entropy_part_zerop(double sa, double pt0);
  void   gsw_entropy_second_derivatives(double sa, double ct,
      double[] eta_sa_sa, double[] eta_sa_ct, double[] eta_ct_ct);
  double gsw_fdelta(double p, double lon, double lat);
  void   gsw_frazil_properties(double sa_bulk, double h_bulk, double p,
      double[] sa_final, double[] ct_final, double[] w_ih_final);
  void   gsw_frazil_properties_potential(double sa_bulk, double h_pot_bulk,
      double p, double[] sa_final, double[] ct_final,
      double[] w_ih_final);
  void   gsw_frazil_properties_potential_poly(double sa_bulk,
      double h_pot_bulk, double p, double[] sa_final, double[] ct_final,
      double[] w_ih_final);
  void   gsw_frazil_ratios_adiabatic(double sa, double p, double w_ih,
      double[] dsa_dct_frazil, double[] dsa_dp_frazil,
      double[] dct_dp_frazil);
  void   gsw_frazil_ratios_adiabatic_poly(double sa, double p,
      double w_ih, double[] dsa_dct_frazil, double[] dsa_dp_frazil,
      double[] dct_dp_frazil);
  double[] gsw_geo_strf_dyn_height(double[] sa, double[] ct, double[] p,
      double p_ref, int n_levels, double[] dyn_height);
  int gsw_geo_strf_dyn_height_1(double[] sa, double[] ct, double[] p,
      double p_ref, int n_levels, double[] dyn_height,
      double max_dp_i, int interp_method);
  double[] gsw_geo_strf_dyn_height_pc(double[] sa, double[] ct,
      double[] delta_p, int n_levels, double[] geo_strf_dyn_height_pc,
      double[] p_mid);
  double gsw_gibbs_ice (int nt, int np, double t, double p);
  double gsw_gibbs_ice_part_t(double t, double p);
  double gsw_gibbs_ice_pt0(double pt0);
  double gsw_gibbs_ice_pt0_pt0(double pt0);
  double gsw_gibbs(int ns, int nt, int np, double sa, double t, double p);
  double gsw_gibbs_pt0_pt0(double sa, double pt0);
  double gsw_grav(double lat, double p);
  double gsw_helmholtz_energy_ice(double t, double p);
  double gsw_hill_ratio_at_sp2(double t);
  void   gsw_ice_fraction_to_freeze_seawater(double sa, double ct,
      double p, double t_ih, double[] sa_freeze, double[] ct_freeze,
      double[] w_ih);
  double gsw_internal_energy(double sa, double ct, double p);
  double gsw_internal_energy_ice(double t, double p);
  void   gsw_ipv_vs_fnsquared_ratio(double[] sa, double[] ct, double[] p,
      double p_ref, int nz, double[] ipv_vs_fnsquared_ratio,
      double[] p_mid);
  double gsw_kappa_const_t_ice(double t, double p);
  double gsw_kappa(double sa, double ct, double p);
  double gsw_kappa_ice(double t, double p);
  double gsw_kappa_t_exact(double sa, double t, double p);
  double gsw_latentheat_evap_ct(double sa, double ct);
  double gsw_latentheat_evap_t(double sa, double t);
  double gsw_latentheat_melting(double sa, double p);
  void   gsw_linear_interp_sa_ct(double[] sa, double[] ct, double[] p, int np,
      double[] p_i, int npi, double[] sa_i, double[] ct_i);
  double gsw_melting_ice_equilibrium_sa_ct_ratio(double sa, double p);
  double gsw_melting_ice_equilibrium_sa_ct_ratio_poly(double sa, double p);
  void   gsw_melting_ice_into_seawater(double sa, double ct, double p,
      double w_ih, double t_ih, double[] sa_final, double[] ct_final,
      double[] w_ih_final);
  double gsw_melting_ice_sa_ct_ratio(double sa, double ct, double p,
      double t_ih);
  double gsw_melting_ice_sa_ct_ratio_poly(double sa, double ct, double p,
      double t_ih);
  double gsw_melting_seaice_equilibrium_sa_ct_ratio(double sa, double p);
  double gsw_melting_seaice_equilibrium_sa_ct_ratio_poly(double sa,
      double p);
  void   gsw_melting_seaice_into_seawater(double sa, double ct, double p,
      double w_seaice, double sa_seaice, double t_seaice,
      double[] sa_final, double[] ct_final);
  double gsw_melting_seaice_sa_ct_ratio(double sa, double ct, double p,
      double sa_seaice, double t_seaice);
  double gsw_melting_seaice_sa_ct_ratio_poly(double sa, double ct,
      double p, double sa_seaice, double t_seaice);
  void   gsw_nsquared(double[] sa, double[] ct, double[] p, double[] lat,
      int nz, double[] n2, double[] p_mid);
  double gsw_o2sol(double sa, double ct, double p, double lon, double lat);
  double gsw_o2sol_sp_pt(double sp, double pt);
  double gsw_pot_enthalpy_from_pt_ice(double pt0_ice);
  double gsw_pot_enthalpy_from_pt_ice_poly(double pt0_ice);
  double gsw_pot_enthalpy_ice_freezing(double sa, double p);
  void   gsw_pot_enthalpy_ice_freezing_first_derivatives(double sa,
      double p, double[] pot_enthalpy_ice_freezing_sa,
      double[] pot_enthalpy_ice_freezing_p);
  void   gsw_pot_enthalpy_ice_freezing_first_derivatives_poly(double sa,
      double p, double[] pot_enthalpy_ice_freezing_sa,
      double[] pot_enthalpy_ice_freezing_p);
  double gsw_pot_enthalpy_ice_freezing_poly(double sa, double p);
  double gsw_pot_rho_t_exact(double sa, double t, double p, double p_ref);
  double gsw_pressure_coefficient_ice(double t, double p);
  double gsw_pressure_freezing_ct(double sa, double ct,
      double saturation_fraction);
  double gsw_pt0_cold_ice_poly(double pot_enthalpy_ice);
  double gsw_pt0_from_t(double sa, double t, double p);
  double gsw_pt0_from_t_ice(double t, double p);
  void   gsw_pt_first_derivatives (double sa, double ct, double[] pt_sa,
      double[] pt_ct);
  double gsw_pt_from_ct(double sa, double ct);
  double gsw_pt_from_entropy(double sa, double entropy);
  double gsw_pt_from_pot_enthalpy_ice(double pot_enthalpy_ice);
  double gsw_pt_from_pot_enthalpy_ice_poly_dh(double pot_enthalpy_ice);
  double gsw_pt_from_pot_enthalpy_ice_poly(double pot_enthalpy_ice);
  double gsw_pt_from_t(double sa, double t, double p, double p_ref);
  double gsw_pt_from_t_ice(double t, double p, double p_ref);
  void   gsw_pt_second_derivatives (double sa, double ct, double[] pt_sa_sa,
      double[] pt_sa_ct, double[] pt_ct_ct);
  void   gsw_rho_alpha_beta (double sa, double ct, double p, double[] rho,
      double[] alpha, double[] beta);
  double gsw_rho(double sa, double ct, double p);
  void   gsw_rho_first_derivatives(double sa, double ct, double p,
      double[] drho_dsa, double[] drho_dct, double[] drho_dp);
  void   gsw_rho_first_derivatives_wrt_enthalpy (double sa, double ct,
      double p, double[] rho_sa, double[] rho_h);
  double gsw_rho_ice(double t, double p);
  void   gsw_rho_second_derivatives(double sa, double ct, double p,
      double[] rho_sa_sa, double[] rho_sa_ct, double[] rho_ct_ct,
      double[] rho_sa_p, double[] rho_ct_p);
  void   gsw_rho_second_derivatives_wrt_enthalpy(double sa, double ct,
      double p, double[] rho_sa_sa, double[] rho_sa_h, double[] rho_h_h);
  double gsw_rho_t_exact(double sa, double t, double p);
  void   gsw_rr68_interp_sa_ct(double[] sa, double[] ct, double[] p, int mp,
      double[] p_i, int mp_i, double[] sa_i, double[] ct_i);
  double gsw_saar(double p, double lon, double lat);
  double gsw_sa_freezing_estimate(double p, double saturation_fraction,
      double[] ct, double[] t);
  double gsw_sa_freezing_from_ct(double ct, double p,
      double saturation_fraction);
  double gsw_sa_freezing_from_ct_poly(double ct, double p,
      double saturation_fraction);
  double gsw_sa_freezing_from_t(double t, double p,
      double saturation_fraction);
  double gsw_sa_freezing_from_t_poly(double t, double p,
      double saturation_fraction);
  double gsw_sa_from_rho(double rho, double ct, double p);
  double gsw_sa_from_sp_baltic(double sp, double lon, double lat);
  double gsw_sa_from_sp(double sp, double p, double lon, double lat);
  double gsw_sa_from_sstar(double sstar, double p,double lon,double lat);
  int    gsw_sa_p_inrange(double sa, double p);
  void   gsw_seaice_fraction_to_freeze_seawater(double sa, double ct,
      double p, double sa_seaice, double t_seaice, double[] sa_freeze,
      double[] ct_freeze, double[] w_seaice);
  double gsw_sigma0(double sa, double ct);
  double gsw_sigma1(double sa, double ct);
  double gsw_sigma2(double sa, double ct);
  double gsw_sigma3(double sa, double ct);
  double gsw_sigma4(double sa, double ct);
  double gsw_sound_speed(double sa, double ct, double p);
  double gsw_sound_speed_ice(double t, double p);
  double gsw_sound_speed_t_exact(double sa, double t, double p);
  void   gsw_specvol_alpha_beta(double sa, double ct, double p,
      double[] specvol, double[] alpha, double[] beta);
  double gsw_specvol_anom_standard(double sa, double ct, double p);
  double gsw_specvol(double sa, double ct, double p);
  void   gsw_specvol_first_derivatives(double sa, double ct, double p,
      double[] v_sa, double[] v_ct, double[] v_p);
  void   gsw_specvol_first_derivatives_wrt_enthalpy(double sa, double ct,
      double p, double[] v_sa, double[] v_h);
  double gsw_specvol_ice(double t, double p);
  void   gsw_specvol_second_derivatives (double sa, double ct, double p,
      double[] v_sa_sa, double[] v_sa_ct, double[] v_ct_ct,
      double[] v_sa_p, double[] v_ct_p);
  void   gsw_specvol_second_derivatives_wrt_enthalpy(double sa, double ct,
      double p, double[] v_sa_sa, double[] v_sa_h, double[] v_h_h);
  double gsw_specvol_sso_0(double p);
  double gsw_specvol_t_exact(double sa, double t, double p);
  double gsw_sp_from_c(double c, double t, double p);
  double gsw_sp_from_sa_baltic(double sa, double lon, double lat);
  double gsw_sp_from_sa(double sa, double p, double lon, double lat);
  double gsw_sp_from_sk(double sk);
  double gsw_sp_from_sr(double sr);
  double gsw_sp_from_sstar(double sstar, double p,double lon,double lat);
  double gsw_sp_salinometer(double rt, double t);
  double gsw_spiciness0(double sa, double ct);
  double gsw_spiciness1(double sa, double ct);
  double gsw_spiciness2(double sa, double ct);
  double gsw_sr_from_sp(double sp);
  double gsw_sstar_from_sa(double sa, double p, double lon, double lat);
  double gsw_sstar_from_sp(double sp, double p, double lon, double lat);
  double gsw_t_deriv_chem_potential_water_t_exact(double sa, double t,
      double p);
  double gsw_t_freezing(double sa, double p, double saturation_fraction);
  void   gsw_t_freezing_first_derivatives_poly(double sa, double p,
      double saturation_fraction, double[] tfreezing_sa,
      double[] tfreezing_p);
  void   gsw_t_freezing_first_derivatives(double sa, double p,
      double saturation_fraction, double[] tfreezing_sa,
      double[] tfreezing_p);
  double gsw_t_freezing_poly(double sa, double p,
      double saturation_fraction);
  double gsw_t_from_ct(double sa, double ct, double p);
  double gsw_t_from_pt0_ice(double pt0_ice, double p);
  double gsw_thermobaric(double sa, double ct, double p);
  void   gsw_turner_rsubrho(double[] sa, double[] ct, double[] p, int nz,
      double[] tu, double[] rsubrho, double[] p_mid);
  int    gsw_util_indx(double[] x, int n, double z);
  double[] gsw_util_interp1q_int(int nx, double[] x, int[] iy, int nxi,
      double[] x_i, double[] y_i);
  double[] gsw_util_linear_interp(int nx, double[] x, int ny, double[] y,
      int nxi, double[] x_i, double[] y_i);
  void   gsw_util_sort_real(double[] rarray, int nx, int[] iarray);
  double gsw_util_xinterp1(double[] x, double[] y, int n, double x0);
  int gsw_util_pchip_interp(double[] x, double[] y, int n,
      double[] xi, double[] yi, int ni);
  double gsw_z_from_p(double p, double lat, double geo_strf_dyn_height,
      double sea_surface_geopotential);
  double gsw_p_from_z(double z, double lat, double geo_strf_dyn_height,
      double sea_surface_geopotential);
}
