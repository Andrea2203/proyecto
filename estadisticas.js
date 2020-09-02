import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Paper from '@material-ui/core/Paper';
import Grid from '@material-ui/core/Grid';
import {Bar} from 'react-chartjs-2';
import {Pie} from 'react-chartjs-2';
import {Doughnut} from 'react-chartjs-2';


import Typography from '@material-ui/core/Typography';

const useStyles = makeStyles((theme) => ({
  root: {
    flexGrow: 1,
  },
  paper: {
    padding: theme.spacing(2),
    textAlign: 'center',
    color: theme.palette.text.secondary,
  },
}));
const data = {
    labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
    datasets: [
      {
        label: 'Usuarios/mes',
        backgroundColor: 'rgba(10,99,132,0.2)',
        borderColor: 'rgba(10,99,132,1)',
        borderWidth: 1,
        hoverBackgroundColor: 'rgba(10,99,132,0.4)',
        hoverBorderColor: 'rgba(10,99,132,1)',
        data: [65, 59, 80, 81, 56, 55, 40]
      }
    ]
  };
  
  const data1 = {
	labels: [
		'0%-37%',
		'38%-67%',
		'68%-100%'
	],
	datasets: [{
		data: [300, 50, 100],
		backgroundColor: [
		'#FF6384',
		'#36A2EB',
		'#FFCE56'
		],
		hoverBackgroundColor: [
		'#FF6384',
		'#36A2EB',
		'#FFCE56'
		]
	}]
}; 
const data2 = {
	labels: [
		'Red',
		'Green',
		'Yellow'
	],
	datasets: [{
		data: [300, 50, 100],
		backgroundColor: [
		'#FF6384',
		'#36A2EB',
		'#FFCE56'
		],
		hoverBackgroundColor: [
		'#FF6384',
		'#36A2EB',
		'#FFCE56'
		]
	}]
};
export default function CenteredGrid() {
  const classes = useStyles();

  return (
    <div className={classes.root}>
          <Typography variant="h3" noWrap>
            Estadisticas de uso Aplicativo
          </Typography>
      <Grid container spacing={3}>
        
        <Grid item xs={6}>
          <Paper className={classes.paper}>
          <Typography variant="h6" noWrap>
          Numero de usuarios por meses
          </Typography>
          <Bar
          data={data}
          width={100}
          height={300}
          options={{
            maintainAspectRatio: false
          }}
        /></Paper>
        </Grid>
        <Grid item xs={6}>
          <Paper className={classes.paper}>
        <Typography variant="h6" noWrap>
          Porcentaje de uso en el mes
          </Typography>
            <Pie data={data1}/>
            </Paper>
        </Grid>
        <Grid item xs={6}>
          <Paper className={classes.paper}>
          <Typography variant="h6" noWrap>
          Porcentaje de uso en el mes
          </Typography>
          <Doughnut data={data2}  />
          </Paper>
        </Grid>

      </Grid>
    </div>
  );
}