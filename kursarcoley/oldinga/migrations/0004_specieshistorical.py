# -*- coding: utf-8 -*-
# Generated by Django 1.10.2 on 2017-04-30 06:49
from __future__ import unicode_literals

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('oldinga', '0003_djangomigrations'),
    ]

    operations = [
        migrations.CreateModel(
            name='SpeciesHistorical',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('site', models.CharField(blank=True, max_length=12, null=True)),
                ('old_species_number', models.CharField(blank=True, db_column='Old_Species_Number', max_length=7, null=True)),
                ('species_code', models.CharField(max_length=11)),
                ('genus', models.CharField(blank=True, db_column='Genus', max_length=12, null=True)),
                ('species_name', models.CharField(blank=True, db_column='Species_name', max_length=25, null=True)),
                ('comment', models.CharField(blank=True, max_length=45, null=True)),
                ('note_chem_anal', models.TextField(blank=True, db_column='Note_Chem_Anal', null=True)),
                ('updated', models.DateTimeField(db_column='Updated')),
            ],
            options={
                'db_table': 'Species_historical',
                'managed': False,
            },
        ),
    ]
